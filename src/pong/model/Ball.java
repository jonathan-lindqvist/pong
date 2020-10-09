package pong.model;

import java.util.Random;

import static pong.model.Pong.GAME_HEIGHT;
import static pong.model.Pong.GAME_WIDTH;

/*
 * A Ball for the Pong game
 * A model class
 */
public class Ball extends Movable implements IPositionable{

    public static final double WIDTH = 40;
    public static final double HEIGHT = 40;
    private double posX = 300;
    private double posY = 200;
    private double dx;
    private double dy;
    private double speedMultiplier = 1.05;
    private Random rand = new Random();


    public Ball(double dx, double dy) {
        this.dx = dx;
        this.dy = dy;
    }

    public Ball(){
        // TODO
        /*
        Generate speed for x and y
        if x is negative it should be going to the left and if positive to the right
        if y is negative it should be going down and if positive up
        change so ball starts in middle
        might need direction variable instead of letting speed handle it
         */
        this(0,0);
    }

    @Override
    public double getX() {
        return posX;
    }

    @Override
    public double getY() {
        return posY;
    }

    @Override
    public double getWidth() {
        return WIDTH;
    }

    @Override
    public double getHeight() {
        return HEIGHT;
    }

    @Override
    public void move() {
        if(dy == 0 && dx == 0){
            //TODO get random direction if it does not have any rand

        }

    }
}
