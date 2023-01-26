package services;

public class CheckPoint {
    public static boolean checkPoint(float x, float y, float r){
        return (x >= 0 && y <= 0 && (x < r / 2 && y > -r))
                || (x <= 0 && y <= 0 && (y > -r - x))
                || (x >= 0 && y >= 0 && (x * x + y * y < r * r / 4));
    }
}
