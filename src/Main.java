public class Main {
    public static void main(String[] args) {
        int StartingScore = 500;
        int refill = 1200;
        int FinalScore;
        int bonus;
        if (refill > 1000) {
            bonus = refill / 100;
            FinalScore = StartingScore + refill + bonus;
        } else {
            FinalScore = StartingScore + refill;
            bonus = 0;
        }


        System.out.print("Количество бонусных рублей - " + bonus + "; итоговый баланс - " + FinalScore + " рублей.");

    }
}

