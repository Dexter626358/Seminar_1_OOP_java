package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {
    public static void findFilm(){
        String userValue;
        ArrayList<Film> setFilms = new ArrayList<>();
        setFilms.add(FilmCollection.film1);
        setFilms.add(FilmCollection.film2);
        setFilms.add(FilmCollection.film3);
        setFilms.add(FilmCollection.film4);
        setFilms.add(FilmCollection.film5);
        setFilms.add(FilmCollection.film6);
        setFilms.add(FilmCollection.film7);
        setFilms.add(FilmCollection.film8);
        setFilms.add(FilmCollection.film9);
        setFilms.add(FilmCollection.film10);
        String[] fields = {"Название фильма или его часть", "Год выпуска", "Режиссер", "Страна выпуска", "Рейтинг",
                "Жанр", "Выход"};
        String fieldResearch = """
                1 - Название фильма,
                2 - Год выпуска,
                3 - Режиссер,
                4 - Страна выпуска,
                5 - Рейтинг,
                6 - Жанр,
                7 - Выход.
                """;
        boolean flag = true;
        System.out.println("Добро пожаловать в Кино поиск!");
        System.out.println("Здесь вы можете найти фильм на любой вкус!");
        Scanner scan = new Scanner(System.in);
        while (flag){
            System.out.println("Выберите поле по которому хотите осуществлять поиск: ");
            System.out.println(fieldResearch);
            String field = scan.nextLine();
            if(field.equals("1")){
                System.out.println(String.format("Введите %s:", fields[Integer.parseInt(field) - 1]));
                userValue = scan.nextLine();
                Film.getName(setFilms, userValue);
            }else if(field.equals("2")){
                System.out.println(String.format("Введите %s:", fields[Integer.parseInt(field) - 1]));
                userValue = scan.nextLine();
                Film.getYear(setFilms, Integer.parseInt(userValue));
            }else if(field.equals("3")){
                System.out.println(String.format("Введите %s:", fields[Integer.parseInt(field) - 1]));
                userValue = scan.nextLine();
                Film.getDirector(setFilms, userValue);
            }else if(field.equals("4")){
                System.out.println(String.format("Введите %s:", fields[Integer.parseInt(field) - 1]));
                userValue = scan.nextLine();
                Film.getCountry(setFilms, userValue);
            }else if(field.equals("5")){
                System.out.println(String.format("Введите %s:", fields[Integer.parseInt(field) - 1]));
                userValue = scan.nextLine();
                Film.getRating(setFilms, Double.parseDouble(userValue));
            }else if(field.equals("6")){
                System.out.println(String.format("Введите %s:", fields[Integer.parseInt(field) - 1]));
                userValue = scan.nextLine();
                Film.getGenre(setFilms, userValue);
            }else if(field.equals("7")){
                flag = false;

            }else{
                System.out.println("Некорректный ввод");
                continue;
            }
        }
    }
}
