public class Main {
    public static void main(String[] args){
        test();
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }
    public static void test () { System.out.println("Тест");
    var box = 5;
    System.out.println(box);
    box = box + 2;
    System.out.println(box);
    box = box - 3;
    System.out.println(box);
    box = box * 3;
    System.out.println(box);
    box = box / 4;
    System.out.println(box);
    var liftStrong = 50;
    var stuff = 20;
    var rideStrong = liftStrong - stuff;
    System.out.println("Еще можно положить " + rideStrong + " кг вещей.");

    var appleWod = 2;
    var orangeWod = 3;
    var fruintFull = appleWod + orangeWod;
        System.out.println("Общий вес фруктов " + fruintFull);

    var meat = 4;
    var woter = 5;
    var tomat = 2;
    var cucumber = 2;
    var peper= 2;
    var zucchi = 2;
    var vegetableAll = tomat + cucumber + peper  +zucchi;
    var prodectAll = vegetableAll + meat + woter + fruintFull;
        System.out.println("Общий вес продуктов " + prodectAll + " кг!");
    var leftWey = rideStrong - prodectAll;
        System.out.println("Места осталось " + leftWey + " кг!");
    prodectAll = prodectAll * 2;
        System.out.println("Теперь вес продуктов " + prodectAll);
        leftWey = rideStrong - prodectAll;
        System.out.println("Теперь места осталось " + leftWey + " кг.");

    var overload = prodectAll % rideStrong;
        System.out.println("Перегруз на " + overload + " кг!");
        var prodToCar = prodectAll / 2;
        System.out.println("Продуктов в одной машине теперь " + prodToCar + " кг.");
    }
    public static void task1 () {System.out.println("~~~~~~~~~~~Задача 1~~~~~~~~~~~");
        var dog = 8.0;
        var cat = 3.6;
        var peper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(peper);
    }
    public static void task2 () { System.out.println("~~~~~~~~~~~Задача 2~~~~~~~~~~~");
        var dog = 8.0;
        var cat = 3.6;
        var peper = 763789;
        dog = dog + 4;
        cat = cat + 4;
        peper = peper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(peper);
    }
    public static void task3 () { System.out.println("~~~~~~~~~~~Задача 3~~~~~~~~~~~");
        var dog = 12.0;
        var cat = 7.6;
        var peper = 763793;
        dog = dog - 3.5;
        cat = cat - 1.6;
        peper = peper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(peper);
    }
    public static void task4 () { System.out.println("~~~~~~~~~~~Задача 4~~~~~~~~~~~");
        var friend = 19;
        System.out.println(friend);
        friend = friend +2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
    }
    public static void task5 () { System.out.println("~~~~~~~~~~~Задача 5~~~~~~~~~~~");
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
    }
    public static void task6 () { System.out.println("~~~~~~~~~~~Задача 6~~~~~~~~~~~");
        var boxer1 = 78.2;
        var boxer2 = 82.7;
        var boxerAllWeight = boxer1 + boxer2;
        System.out.println("Общий вес двух бойцов " + boxerAllWeight + " кг.");
        var boxerDifference = boxer2 - boxer1;
        System.out.println("Разница в весе между бойцами " + boxerDifference + " кг.");
    }
    public static void task7 () { System.out.println("~~~~~~~~~~~Задача 7~~~~~~~~~~~");
        var boxer1 = 78.2;
        var boxer2 = 82.7;
        var boxerDifference1 = boxer2 - boxer1;
        System.out.println("Разница в весе между бойцами " + boxerDifference1 + " кг.");
        var boxerDifference2 = boxer2 % boxer1;
        System.out.println("Разница в весе между бойцами " + boxerDifference2 + " кг.");

    }
    public static void task8 () { System.out.println("~~~~~~~~~~~Задача 8~~~~~~~~~~~");
        var allTime = 640;
        var timeOneHuman = 8;
        var allHumanInJob = allTime / timeOneHuman;
        System.out.println("Всего работников в компании - " +allHumanInJob + " человек.");
        var newAllHumanInJob = allHumanInJob + 94;
        var newTimeOneHuman = allTime / newAllHumanInJob;
        System.out.println("Если в компании работает - " + newAllHumanInJob + " человек, то всего "
                + newTimeOneHuman + " часа работы может быть поделено между сотрудниками.");
    }
}
