import java.util.Random;

public class LuckyMoney{
    int number;
    double total_money;
    double[] share_money;
    public LuckyMoney(int in_num, double in_money){
        number = in_num;
        total_money = in_money;
        GenerateShares();
    }

    public double[] display(){
        return this.share_money;
    }
    private void GenerateShares(){
        double[] share = new double [number];
        double total = 0.0;
        for(int i = 0; i < number; i++){
            share[i] = Math.random();
            total += share[i];
        }
        share_money = new double [number];
        for(int i = 0; i<number; i++){
            share_money[i] = (share[i]/total) * total_money;
        }

    }


}