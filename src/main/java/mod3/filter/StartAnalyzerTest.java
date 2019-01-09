package mod3.filter;

public class StartAnalyzerTest {

    String [] spamKeyWords = {"fuck", "dick", "kill"};
    int maxCommentLength = 40;

    TextAnalyzer[] analyzer = {new SpamAnalyzer(spamKeyWords), new NegativeTextAnalyzer(), new TooLongTextAnalyzer(maxCommentLength)};


    public static void main(String[] args) {

        StartAnalyzerTest test = new StartAnalyzerTest();
        System.out.println(test.checkLabels(test.analyzer, "fuck them all"));
        System.out.println(test.checkLabels(test.analyzer, "I am going to the school :|"));
        System.out.println(test.checkLabels(test.analyzer, "kjfksjdkfjkjkjkfjkjsd jkjfjsifiisjjfk j kjfksjkjkfjk jkj  fksdjkfjkdjskfjkjskjfkjks iyrywtrtwtyuh j"));



    }

    abstract class KeywordAnalyzer implements TextAnalyzer {

        protected abstract String[] getKeyWords();

        protected abstract Label getLabel();

        public Label processText(String text) {
            String[] keyWords = getKeyWords();
            for (String keyWord: keyWords) {
                if(text.contains(keyWord)) {
                    return getLabel();
                }
            }
            return Label.OK;
        }
    }

    class SpamAnalyzer extends KeywordAnalyzer  {

        private String[] keyWords;

        public SpamAnalyzer(String[] keyWords) {
            this.keyWords = keyWords;
        }

        @Override
        protected String[] getKeyWords() {
            return keyWords;
        }

        @Override
        protected Label getLabel() {
            return Label.SPAM;
        }
    }

    class NegativeTextAnalyzer extends KeywordAnalyzer  {

        private String[] keyWords = {":(", "=(", ":|"};

        @Override
        protected String[] getKeyWords() {
            return keyWords;
        }

        @Override
        protected Label getLabel() {
            return Label.NEGATIVE_TEXT;
        }
    }

    class TooLongTextAnalyzer implements TextAnalyzer {

        private int maxLength;

        public TooLongTextAnalyzer(int maxLength) {
            this.maxLength = maxLength;
        }

        @Override
        public Label processText(String text) {
            if(text.length() > maxLength) {
                return Label.TOO_LONG;
            }else
                return Label.OK;
        }
    }

    public Label checkLabels(TextAnalyzer[] analyzers, String text) {
        for (int i = 0; i < analyzers.length; i++)
            if (analyzers[i].processText(text) != Label.OK)
                return analyzers[i].processText(text);
        return Label.OK;
    }





}
