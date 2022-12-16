package org.example;

import java.util.ArrayList;

public class Film {
    public int filmId;
    public String filmName;
    public String genre;
    public String filmDirector;
    public int year;
    public String country;
    public double rate;

    public Film(int filmId, String filmName, String genre, String filmDirector, int year, String country, double rate){
        this.filmId = filmId;
        this.filmName = filmName;
        this.genre = genre;
        this.filmDirector = filmDirector;
        this.year = year;
        this.country = country;
        this.rate = rate;
    }

    public static ArrayList<Film> getName(ArrayList<Film> set, String userValue) {
        ArrayList<Film> setResult = new ArrayList<>();
        for (Film item: set) {
            if (item.filmName.equalsIgnoreCase(userValue) || item.filmName.contains(userValue)) {
                setResult.add(item);
            }
        }
        printer(setResult);
        return setResult;
    }

    public static ArrayList<Film> getGenre(ArrayList<Film> set, String userValue) {
        ArrayList<Film> setResult = new ArrayList<>();
        for (Film item: set) {
            if (item.genre.equalsIgnoreCase(userValue)) {
                setResult.add(item);
            }
        }
        printer(setResult);
        return setResult;
    }

    public static ArrayList<Film> getDirector(ArrayList<Film> set, String userValue) {
        ArrayList<Film> setResult = new ArrayList<>();
        for (Film item: set) {
            if (item.filmDirector.equalsIgnoreCase(userValue) || item.filmDirector.contains(userValue)) {
                setResult.add(item);
            }
        }
        printer(setResult);
        return setResult;
    }

    public static ArrayList<Film> getCountry(ArrayList<Film> set, String userValue) {
        ArrayList<Film> setResult = new ArrayList<>();
        for (Film item: set) {
            if (item.country.equalsIgnoreCase(userValue)) {
                setResult.add(item);
            }
        }
        printer(setResult);
        return setResult;
    }

    public static ArrayList<Film> getYear(ArrayList<Film> set, int userValue) {
        ArrayList<Film> setResult = new ArrayList<>();
        for (Film item: set) {
            if (item.year == userValue) {
                setResult.add(item);
            }
        }
        printer(setResult);
        return setResult;
    }

    public static ArrayList<Film> getRating(ArrayList<Film> set, double userValue) {
        ArrayList<Film> setResult = new ArrayList<>();
        for (Film item: set) {
            if (item.rate >= userValue) {
                setResult.add(item);
            }
        }
        printer(setResult);
        return setResult;
    }

    public static void printer(ArrayList<Film> setResult){
        if(!setResult.isEmpty()){
            System.out.println("По Вашему запросу найдены следующие результаты: ");
            for (Film item: setResult) {
                System.out.println(String.format(" Название фильма - %s,\n Жанр - %s,\n Режиссер - %s,\n Год выхода - %d,\n  Страна - %s,\n Рейтинг - %.1f",
                        item.filmName, item.genre, item.filmDirector, item.year, item.country, item.rate));
                System.out.println();
                System.out.println("===================================================================================");
                System.out.println("===================================================================================");
                System.out.println();

            }
        }else{
            System.out.println("По Вашему запросу ничего не найдено");
            System.out.println();
        }
    }









}

