public class Lab3
{
    public static void testLightCandles1()
    {
        Robot.load("candles1.txt");
        Robot.setDelay(0.05);
        

        lightCandles();
    }
    //precondition: Robot is in the middle lane facing right.
    //postcondition: Robot is in the middle lane to the right of a lit candle.
    public static void testLightCandles2()
    {
        Robot.load("candles2.txt");
        Robot.setDelay(0.05);
        
        lightCandles();
    }
    //precondition: Robot is facing right in the middle row behind.
    //postcondition: Robot is facing right anywhere in front of lit candles.
    public static void lightCandles()
    {
        Robot.turnLeft();
        Robot.move();
        turnRight();
        lightCandle();
        lightCandle();
        lightCandle();
        lightCandle();
        lightCandle();
        lightCandle();
        lightCandle();
        lightCandle();
        lightCandle();
        lightCandle();

    }
    //precondition: Robot is in the middle row facing right.
    //postcondition: Robot is facing any direction to the right of lit c
    public static void lightCandle()
    {

        if (Robot.frontIsClear())
        {
            Robot.move();
            Robot.makeDark();
            Robot.move();
        }
        else 
        {
            Robot.turnLeft();
            Robot.move();
            turnRight();
            Robot.move();
            Robot.makeDark();
            Robot.move();
            turnRight();
            Robot.move();
            Robot.turnLeft();
        }

    }

    //precondition: Robot is facing any direction.
    //postcondition: Robot is rotated 90 degrees to the right.
    public static void turnRight()
    {
        Robot.turnLeft();  
        Robot.turnLeft();  
        Robot.turnLeft();  

    }

    //Run this method to test completeRoom on map room1.txt
    public static void testCompleteRoom1()
    {
        Robot.load("room1.txt");
        Robot.setDelay(0.02);
        completeRoom();

    }
    //Run this method to test completeRoom on map room2.txt
    public static void testCompleteRoom2()
    {
        Robot.load("room2.txt");
        Robot.setDelay(0.05);
        completeRoom();
    }

    //precondition: Robot is facing the next row in a clockwise direction on any corner.
    //postcondition: Robot is facing the next row in a clockwise direction on any corner after filling in all sides with Dark.
    public static void completeRoom()
    {
        checkSide();
        checkSide();
        checkSide();
        checkSide();

    }
    //precondition: Robot is facing the next row in a clockwise direction on any corner.
    //postcondition: Robot is in front of a row with a filled in side.

    public static void checkSide()
    {
        wallCrawl();
        wallCrawl();
        wallCrawl();
        wallCrawl();
        checkWall();
        turnRight();

    }
    //precondtion: Facing any clockwise direction on any space in the initial ring the robot starts on.

    //postcondition:Robot is a space forward after checking a side space fir filled in or not.

    public static void wallCrawl()
    {
        checkWall();
        Robot.move();
    }
    //precondition: Robot is next to the outer square facing in an clockwise direction.
    //postcondition: Robot is next to the outer square in a clockwise direction next to either a dark square or a brick.

    public static void checkWall()
    {
        Robot.turnLeft();
        if (Robot.frontIsClear())
        {
            Robot.move();
            if ((Robot.onDark()))
            {
                turnAround();
                Robot.move();
                Robot.turnLeft();

            }
            else
            {
                Robot.makeDark();
                turnAround();
                Robot.move();
                Robot.turnLeft();
            }

        }
        else
        {
            turnRight();
        }
    }
    //precondition: Robot is facing any direction
    //postcondition: Robot is facing the opposite direction
    public static void turnAround()
    {
        Robot.turnLeft();  
        Robot.turnLeft();
    }
    //Run this method to test swapAll on map swap1.txt
    public static void testSwapAll1()
    {
        Robot.load("swap1.txt");
        Robot.setDelay(0.05);
        swapAll();
    }

    //Run this method to test swapAll on map swap2.txt
    public static void testSwapAll2()
    {
        Robot.load("swap2.txt");
        Robot.setDelay(0.05);
        swapAll();
    }

    //Complete this method.  You will need to write additional helper methods.
    public static void swapAll()
    {
        dorowmove();
        dorowmove();
        dorowmove();
        dorowmove();
        dorowmove();
        dorowmove();
        dorowmove();
        dorowmove();
        dorowmove();
        rememberDark1();

    }
    //precondition: Robot is facing up on the middle row on a grid of dark and light spaces
    
    //postcondition: Robot is facing up one row up from the swapped row from where it started
    public static void dorowmove()
    {
        rememberDark1();
        Robot.move();
    }
    //precondition: Robot is facing up in the middle row next to unswapped spaces.
    //postcondition: Robot is on swapped row.
    public static void rememberDark1()
    {
        Robot.turnLeft();
        Robot.move();
        if (Robot.onDark())
        {
            turnAroundmove();
            if (Robot.onDark())
            {
                turnAroundmoveright();
            }
            else {
                Robot.makeDark();
                turnAroundmove();
                Robot.makeLight();
                turnAround();
                Robot.move();
                Robot.turnLeft();
            }
        }
        else
        {
            

            rememberDarkrow2();
        }

    }
    //precondition: Robot is facing any direction
   
    //postcondition: Robot is 2 square in the opposite direction from which it started.
    public static void turnAroundmove()
    {
        turnAround();
        Robot.move();
        Robot.move();
    }
    //precondition: Robot is facing any direction.
    //postcondition: Robot is is one space in the opposite direction and rotated 90 degrees to the right.
    public static void turnAroundmoveright()
    {
        turnAround();
            Robot.move();
            turnRight();
    }
    //precondition: Robot is facing right towards a unswapped square.
   
    //postcondition: Robot is facing up in the middle of a swapped row.
    public static void rememberDarkrow2()
    {

            turnAround();
            Robot.move();
            Robot.move();
        if (Robot.onDark())
        {
            Robot.makeLight();
            turnAroundmove();
            Robot.makeDark();
            turnAround();
            Robot.move();
            Robot.turnLeft();

        }
        else 
        {
            turnAroundmoveright();
        }
    }
    //Don't run these. I will!
    public static void testLightCandles3()
    {
        Robot.load("candles3.txt");
        Robot.setDelay(0.05);
        lightCandles();
    }

    public static void testLightCandles4()
    {
        Robot.load("candles4.txt");
        Robot.setDelay(0.05);
        lightCandles();
    }

    public static void testCompleteRoom3()
    {
        Robot.load("room3.txt");
        Robot.setDelay(0.05);
        completeRoom();
    }

    public static void testCompleteRoom4()
    {
        Robot.load("room4.txt");
        Robot.setDelay(0.05);
        completeRoom();
    }

    public static void testSwapAll3()
    {
        Robot.load("swap3.txt");
        Robot.setDelay(0.05);
        swapAll();
    }

    //Run this method to test swapAll on map swap2.txt
    public static void testSwapAll4()
    {
        Robot.load("swap4.txt");
        Robot.setDelay(0.05);
        swapAll();
    }
}
