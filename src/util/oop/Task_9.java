package util.oop;

import java.util.ArrayList;

public class Task_9
{
    public static void main(String[] args)
    {
        var basket = new Basket();

        basket.AddBall( new Ball("black", 0.3));
        basket.AddBall( new Ball("blue", 0.2));
        basket.AddBall( new Ball("white", 0.35));
        basket.AddBall( new Ball("red", 0.4));
        basket.AddBall( new Ball("blue", 0.25));

        System.out.printf("\nThere is %d blue balls in the basket\nThe basket total weight is %1.2f kg.\n",
                basket.GetNumberOfBlueBalls(), basket.GetBallsWeight());
    }
}

class Ball
{
    public Ball(String color, double weight)
    {
        this.color = color;
        this.weight = weight;
    }
    double weight;
    String color;
}

class Basket
{
    private ArrayList<Ball> balls = new ArrayList<>();

    public void AddBall(Ball ball)
    {
        balls.add(ball);
    }

    public double GetBallsWeight()
    {
        double result = 0;

        for (var item : balls)
            result += item.weight;

        return result;
    }

    public int GetNumberOfBlueBalls()
    {
        int result = 0;

        for (var item : balls)
        {
            if (item.color.toLowerCase() == "blue")
                result++;
        }

        return result;
    }
}
