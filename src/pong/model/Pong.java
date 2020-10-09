package pong.model;


import pong.event.ModelEvent;
import pong.event.EventBus;

import java.util.ArrayList;
import java.util.List;

/*
 * Logic for the Pong Game
 * Model class representing the "whole" game
 * Nothing visual here
 *
 */
public class Pong {

    public static final double GAME_WIDTH = 600;
    public static final double GAME_HEIGHT = 400;
    public static final double BALL_SPEED_FACTOR = 1.02;
    public static final long HALF_SEC = 500_000_000;


    // TODO More attributes
    private int pointsLeft;
    private int pointsRight;
    private Paddle leftPaddle;
    private Paddle rightPaddle;
    private Ball ball;


    // TODO Constructor
    public Pong(Paddle leftPaddle, Paddle rightPaddle, Ball ball, int pointsLeft, int pointsRight){
        this.leftPaddle = leftPaddle;
        this.rightPaddle = rightPaddle;
        this.ball = ball;
        this.pointsLeft = pointsLeft;
        this.pointsRight = pointsRight;
    }

    public Pong(Paddle leftPaddle, Paddle rightPaddle, Ball ball){
        this(leftPaddle, rightPaddle, ball, 0,0);
    }

    // --------  Game Logic -------------

    private long timeForLastHit;         // To avoid multiple collisions

    public void update(long now) {

       // tODO Gamelogic here
        ball.move();
    }


    // --- Used by GUI  ------------------------

    public List<IPositionable> getPositionables() {
        List<IPositionable> drawables = new ArrayList<>();
        // TODO
        drawables.add(leftPaddle);
        drawables.add(rightPaddle);
        drawables.add(ball);
        return drawables;
    }

    public int getPointsLeft() {
        return pointsLeft;
    }

    public int getPointsRight() {
        return pointsRight;
    }

    public void setSpeedRightPaddle(double dy) {
        // TODO
    }

    public void setSpeedLeftPaddle(double dy) {
        // TODO
    }
}
