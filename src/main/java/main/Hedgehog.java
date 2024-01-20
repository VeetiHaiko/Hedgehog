package main;

public class Hedgehog {
    private String name;
    private int age;
    private String words;
    

    public Hedgehog() {
        name = "Pikseli";
        age = 5;
        words="";

    }

    public String getWords() {
        return words;
    }
    
    public void speak(String words) {
        if (words.isEmpty()){
            System.out.println("Olen " +name+ " Ja ikäni on " +age+ " vuotta, mutta antaisitko silti syötteen?");
        } else {
        System.out.println(name+ ": " +words);
        }

    }

    public void run(int laps){
        for (int i =0; i < laps; i++) {
            System.out.println(name+ " juoksee kovaa vauhtia!");
        }

    }

    public Hedgehog(String name, int age) {
        this.name = name;
        this.age = age;
        this.words="";
    }

    public void setWords(String words) {
        this.words = words;
        return;
    }

    public void setName(String name) {
        this.name = name;
        return;
    }
    
    public void setAge(int age) {
        this.age = age;
        return;
    }

}

