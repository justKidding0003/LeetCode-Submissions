class Solution {
    public double angleClock(int hour, int minutes) {
        double h = (hour*30 + (0.5*minutes));
        double m = minutes*6;
        double ans = Math.abs(h-m);
        System.out.println(ans);
        System.out.println(h);
        System.out.println(m);
        if(ans>180)
            ans = 360 - ans;
        return ans;
    }
}