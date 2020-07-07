package com.pratul;

class Movie{
    private String name;

    public Movie(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public String plot(){
        return "No plot here";
    }
}

class JohnWick extends Movie{
    public JohnWick() {
        super("John Wick");
    }
    public String plot(){
        return "A man kills lots of people";
    }
}

class IndependenceDay extends Movie{
    public IndependenceDay(){
        super("Independence Day");
    }
    public String plot(){
        return "Aliens take over earth";
    }
}
class MazeRunner extends Movie{
    public MazeRunner(){
        super("Maze Runner");
    }
    public String plot(){
        return "Kids try and escape";
    }
}

class StarWars extends Movie{
    public StarWars(){
        super("Star Wars");
    }
    public String plot(){
        return "Forces take over planet";
    }
}

class Forgettable extends Movie{
    public Forgettable(){
        super("Forgettable");
    }
}

public class Main {

    public static void main(String[] args) {
        // write your code here
        for(int i=0; i<11; i++){
            Movie movie = randomMovie();
            System.out.println("Name of movie:"+movie.getName()+"\n"+
                                "Plot: "+movie.plot());
        }
    }
        public static Movie randomMovie(){
            int randomNumber = (int)(Math.random() * 5) + 1;
            System.out.println("Random number: "+randomNumber);
            switch (randomNumber){
                case 1:
                    return new JohnWick();
                case 2:
                    return new IndependenceDay();
                case 3:
                    return new MazeRunner();
                case 4:
                    return new StarWars();
                case 5:
                    return new Forgettable();
            }
         return null;
    }
}
