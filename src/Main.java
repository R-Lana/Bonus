public class Main {
    public static void main(String[] args) {
        int StartingScore = 100;
        int refill = 1300;
        int FinalScore;
        int bonus;

        if (refill > 1000) {
            bonus = refill / 100;
        } else {

            bonus = 0;
        }
        FinalScore = StartingScore + refill + bonus;

        System.out.print("Количество бонусных рублей - " + bonus + "; итоговый баланс - " + FinalScore + " рублей.");


    }
}
