package mod3;

public class Game {

    public static void main(String[] args) {

        Robot robot = new Robot();
        moveRobot(robot, 1, 0);
        moveRobot(robot, 0, 1);
        moveRobot(robot, -1, 0);
        moveRobot(robot, 0, -1);



    }

    public static void moveRobot(Robot robot, int toX, int toY) {

        while (robot.getDirection() != Direction.UP) {
            robot.turnRight();
        }

        int robX = robot.getX();
        int robY = robot.getY();

        System.out.println("Начальная позиция робота (" + robX + "," + robY + ") направление " + robot.getDirection());




        //описание движения в первой четверти
        if(robot.getX() <= toX && robot.getY() <= toY) {
            robot.turnRight();
            while (robot.getX() != toX) {
                robot.stepForward();
            }
            robot.turnLeft();
            while (robot.getY() != toY) {
                robot.stepForward();
            }

            System.out.println("Робот пришел в позицию (" + robot.getX() + "," + robot.getY() + ") направление " + robot.getDirection());

        }

        //описание движения во второй четверти

        if(robot.getX() <= toX && robot.getY() >= toY) {
            robot.turnRight();
            while (robot.getX() != toX) {
                robot.stepForward();
            }
            robot.turnRight();
            while (robot.getY() != toY) {
                robot.stepForward();
            }

            System.out.println("Робот пришел в позицию (" + robot.getX() + "," + robot.getY() + ") направление " + robot.getDirection());

        }

        //третья четверть
        if(robot.getX() >= toX && robot.getY() >= toY) {
            robot.turnLeft();
            while (robot.getX() != toX) {
                robot.stepForward();
            }
            robot.turnLeft();
            while (robot.getY() != toY) {
                robot.stepForward();
            }

            System.out.println("Робот пришел в позицию (" + robot.getX() + "," + robot.getY() + ") направление " + robot.getDirection());

        }


        //четвертая четверть

        if(robot.getX() >= toX && robot.getY() <= toY) {
            robot.turnLeft();
            while (robot.getX() != toX) {
                robot.stepForward();
            }
            robot.turnRight();
            while (robot.getY() != toY) {
                robot.stepForward();
            }
            System.out.println("Робот пришел в позицию (" + robot.getX() + "," + robot.getY() + ") направление " + robot.getDirection());


        }
    }

}


