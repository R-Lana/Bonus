public class Main {
    public static void main(String[] args) {
        int StartingScore = 1_000;
        int refill = 1_200;
        int FinalScore;
        int bonus = 0;

        if (refill > 1_000) {
            bonus = refill / 100;
        }

        FinalScore = StartingScore + refill + bonus;

        System.out.print("Количество бонусных рублей - " + bonus + "; итоговый баланс - " + FinalScore + " рублей.");

    }
}
