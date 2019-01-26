package mod3.robot;

public class Game {

    public static void main(String[] args) {

        Robot robot = new Robot();

        moveRobot(robot, 1, 0);
       // moveRobot(robot, 0, 1);
        //moveRobot(robot, -1, 0);
       // moveRobot(robot, 0, -1);
    }

    //task from module 4. Exception
    public static void moveRobot(RobotConnectionManager robotConnectionManager, int toX, int toY) {
        // your implementation here
        int count = 0;
        boolean isRun = false;
        while (count < 3){
            try (RobotConnection con = robotConnectionManager.getConnection()){
                con.moveRobotTo(toX, toY);
                isRun = true;
                count = 3; //if robot run, then set cont == 3 and exit from loop
            } catch (RobotConnectionException rce) {
                if (isRun) {
                    //if robot run, then set cont == 3 and exit from loop
                    count = 3;
                }
                else {
                    count++;
                    if (count == 3) {
                        throw new RobotConnectionException("3", rce);
                    }
                }
            } catch (Throwable e) {
                throw e;
            }
        }
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
            System.out.println("Робот пришел в позицию (" + robot.getX() + "," + robot.getY()
                    + ") направление " + robot.getDirection());
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
            System.out.println("Робот пришел в позицию (" + robot.getX() + "," + robot.getY()
                    + ") направление " + robot.getDirection());
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
            System.out.println("Робот пришел в позицию (" + robot.getX() + "," + robot.getY()
                    + ") направление " + robot.getDirection());
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
            System.out.println("Робот пришел в позицию (" + robot.getX() + "," + robot.getY()
                    + ") направление " + robot.getDirection());
        }
    }
}


