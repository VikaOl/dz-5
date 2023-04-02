//1. Надає значення 4 полям типу int.
//2. Сумує їх попарно.
//3. Виводить результат порівняння сум (true, якщо перша сума більша).
//4. Збільшує першу суму на 1.
//5. Другу суму зменшує на 2.
//6. Виводить результат порівняння (true якщо перша сума більша).
//7. Виводить true якщо хоча б одна сума кратна 2, інакше - false.
public class Main {
    public static void main(String[] args) {
        int a = 10;
        int b = 2;
        int c = 10;
        int d = 3;
        int sum1 = a + b;
        int sum2 = c + d;
        String result = sum1 > sum2 ? "True" : "False";
        System.out.println(result);

        sum1 = sum1 + 1;
        sum2 = sum2 - 2;
        String result2 = sum1 > sum2 ? "True" : "False";
        System.out.println(result2);

        String result3 = sum1 % 2 == 0 || sum2 % 2 == 0 ? "True" : "False";
        System.out.println(result3);
    }
}