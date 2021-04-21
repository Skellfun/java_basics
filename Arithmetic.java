public class Arithmetic {

    private int x;
    private int y;
    private double value;

    public Arithmetic(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void summ() {   //сумма
        value = x + y;
        System.out.println("Сумма = " + value);
    }

    public void diff() {   //разность
        value = x - y;
        System.out.println("Разность = " + value);
    }

    public void prod() {   //произведение
        value = x * y;
        System.out.println("Произведение = " + value);
    }

    public void mean() {   //среднее значение
        value = (x + y) / 2;
        System.out.println("Среднее значение = " + value);
    }

    public void min() {   //минимальное значение
        value = Math.min(x, y);
        System.out.println("Минимальное значение = " + value);
    }

    public void max() {   //максимальное значение
        value = Math.max(x, y);
        System.out.println("Максимальное значение = " + value);
    }
}