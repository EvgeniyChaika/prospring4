package cz.elk.aopexample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class WiseManImpl implements WiseMan {

    private final String[] WISE_STATEMENTS = new String[]{
            "Give a man a match, and he'll be warm for a minute, but set him on fire, and he'll be warm for the rest of his life.",
            "The real trouble with reality is that there's no background music.",
            "Going to church doesn't make you a Christian any more than standing in a garage makes you a car.",
            "Everyone is entitled to be stupid, but some abuse the privilege.",
            "War doesn't determine who's right. War determines who's left.",
            "It's your god. They're your rules. *You* go to hell.",
            "I once prayed to god for a bike, but quickly found out he didnt work that way...so I stole a bike and prayed for his forgiveness",
            "If pro is opposite of con, then what is the opposite of progress?",
            "My god carries a hammer. Your god died nailed to a tree. Any questions?",
            "Sarcasm helps keep you from telling people what you really think of them.",
            "If you think things can't get worse it's probably only because you lack sufficient imagination.",
            "A train station is where the train stops. A bus station is where the bus stops. On my desk, I have a work station...",
            "You can't be late until you show up.",
            "Knowledge is realizing that the street is one-way, wisdom is looking both directions anyway",
            "Parents spend the first part of our lives teaching us to walk and talk, and the rest of it telling us to sit down and shut up.",
            "Expecting the world to treat you fairly because you are good is like expecting the bull not to charge because you are a vegetarian.",
            "A single death is a tragedy; a million deaths is a statistic.",
            "The secret to creativity is knowing how to hide your sources",
            "books have knowledge, knowledge is power, power corrupts, corruption is a crime, and crime doesn't pay..so if you keep reading, you'll go broke",
            "Advice for the day: If you have a headache, do what it says on the aspirin bottle: Take two, and KEEP AWAY FROM CHILDREN. ",
            "Optimism: Waiting for a ship to come in when you haven't sent one out.",
            "As Long As There Are Tests, There Will Be Prayer In Public Schools.",
            "Never interrupt your opponent while he's making a mistake.",
            "You can go anywhere you want if you look serious and carry a clipboard.",
            "If you don't pray in my school, I won't think in your church.",
            "You know your god is man-made when he hates all the same people you do.",
            "Love is like pi - natural, irrational, and very important.",
            "life, n.: A whim of several billion cells to be you for a while",
            "Evolutionists have proof without any certainty. Creationists have certainty without any proof.",
            "It isn't homework unless it's due tomorrow.",
            "You never learn anything by doing it right.",
            "Friendships last when each friend thinks he has a slight superiority over the other.",
            "It may look like I'm doing nothing, but I'm actively waiting for my problems to go away.",
            "I come from a small town whose population never changed. Each time a woman got pregnant, someone left town.",
            "Anyone who uses the phrase \"easy as taking candy from a baby\" has never tried taking candy from a baby.",
            "It only takes 20 years for a liberal to become a conservative without changing a single idea.",
            "The shortest distance between two points is under construction.",
            "Drawing on my fine command of language, I said nothing.",
            "A criminal is a person with predatory instincts who has not sufficient capital to form a corporation.",
            "Every rule has an exception. Especially this one."
    };

    Random r = new Random();
    private int statementNo = 0;

    @Autowired
    Printer printer;

    @Override
    public synchronized void saySomethingClever() {
        int index = statementNo % WISE_STATEMENTS.length;
        printer.println(WISE_STATEMENTS[index]);
    }

    @Override
    @MeasureTheTime
    public synchronized void thinkUpSomethingClever() {
        int delay = r.nextInt(1000);

        try {
            Thread.sleep(delay);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        statementNo++;
    }
}







