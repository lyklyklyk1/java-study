package main;

public class TestEquals {
    public static void main(String[] args) {
        Cat c1 = new Cat(1, 1, 1);
        Cat c2 = new Cat(1, 1, 1);

        System.out.println("c1==c2:" + (c1 == c2));
        System.out.println("c1.equals(c2):" + (c1.equals(c2)));

        String s1 = new String("hello");
        String s2 = new String("hello");
        System.out.println("s1 == s2的结果是：" + (s1 == s2));//false
        System.out.println("s1.equals(s2)的结果是：" + s1.equals(s2));//true

        System.out.println("s1.equals(s2)的结果是：" + s1.equals(s2));//true
    }
}

class Cat {
    int color, weight, height;

    public Cat(int color, int weight, int height) {
        this.color = color;
        this.weight = weight;
        this.height = height;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        } else {
            if (obj instanceof Cat) {
                Cat c = (Cat) obj;
                if (c.color == this.color && c.weight == this.weight && c.height == this.height) {
                    return true;
                }
            }
        }

        return false;
    }
}
