package pong.model;

import static pong.model.Pong.GAME_HEIGHT;

/*
 * A Paddle for the Pong game
 * A model class
 *
 */
public class Paddle extends Movable implements IPositionable{

    public static final double PADDLE_WIDTH = 10;
    public static final double PADDLE_HEIGHT = 60;
    public static final double PADDLE_SPEED = 5;

    //TODO change in future
    //posx could be final, what should be in abstract?
    private double posX;
    private double posY = 0;

    private double dx;
    private double dy;

    public Paddle(double posX, double posY) {
        this.posX = posX;
        this.posY = posY;
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
        return PADDLE_WIDTH;
    }

    @Override
    public double getHeight() {
        return PADDLE_HEIGHT;
    }

    @Override
    public void move() {

    }
}
