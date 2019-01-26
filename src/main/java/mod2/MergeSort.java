package mod2;

public class MergeSort {
    public int[] mergeArrays(int[] a1, int[] a2) {
        if (a1 == null)
            return a2;
        if (a2 == null)
            return a1;
        int[] a3Sort = new int[a1.length + a2.length];
        int j1 = 0;
        int j2 = 0;
        for (int i=0; i<a3Sort.length; i++){
            if ( (j1<a1.length) && (j2<a2.length) ){
                if (a1[j1] < a2[j2]){
                    a3Sort[i] = a1[j1];
                    j1++;
                } else {
                    a3Sort[i] = a2[j2];
                    j2++;
                }
            } else if (j1<a1.length) {
                a3Sort[i] = a1[j1];
                j1++;
            } else if (j2<a2.length) {
                a3Sort[i] = a2[j2];
                j2++;
            }
        }
        return a3Sort;
    }
}
