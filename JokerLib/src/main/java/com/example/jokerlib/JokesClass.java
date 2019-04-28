package com.example.jokerlib;

import java.util.Random;

public class JokesClass {
    public static String getJoke() {

        String Jokes[] = {
                "My friend thinks he is smart. He told me an onion is the only food that makes you cry, so I threw a coconut at his face.",
                "What happens to a frog's car when it breaks down?\n" +
                        "It gets toad away.",
                "Yo momma so fat when she registered for MySpace there was no space left.",
                "Q: What did the duck say when he bought lipstick?\n A: Put it on my bill",
                "Q: Is Google male or female \n?" +
                        " A: Female, because it doesn't let you finish a sentence before making a suggestion. ",
                "A teacher asked her students to use the word beans in a sentence.My father grows beans, said one girl. My mother cooks beans,said a boy. A third student spoke up, We are all human beans."


        };


        int joke_id = new Random().nextInt(Jokes.length);
        return Jokes[joke_id];
    }
}
