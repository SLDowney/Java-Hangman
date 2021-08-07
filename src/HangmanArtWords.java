public class HangmanArtWords {
    public static final String[] WORDS_ARRAY_EASY = {
            "cat", "airplane", "Alligator", "ant", "apple", "baby",
            "ball", "balloon", "banana", "basketball", "bat", "beach",
            "bear", "bed", "bell", "bike", "bird", "blocks", "bone",
            "book", "bowl", "boy", "bracelet", "branch", "bread",
            "bridge", "bug", "bunk", "bunny", "bus", "carrot", "chair",
            "cheese", "cherry", "chicken", "circle", "clock", "cloud",
            "coat", "cone", "cookie", "corn", "cow", "crab", "cream",
            "cup", "cupcake", "dinosaur", "dog", "doll", "door", "drum",
            "duck", "ear", "ears", "egg", "eyes", "face", "flower",
            "football", "ghost", "giraffe", "girl", "glasses", "grapes",
            "grass", "hat", "head", "heart", "", "hippo", "horse", "house",
            "ice", "inchworm", "jacket", "jar", "jellyfish", "kite", "lamp",
            "leaf", "light", "lips", "lollipop", "milk", "monkey", "", "moon",
            "mouse", "mouth", "nose", "ocean", "orange", "pen", "pencil",
            "person", "pie", "purse", "robot", "rocket", "seashell", "shirt",
            "shoe", "skateboard", "slide", "smile", "snail", "snake", "snowflake",
            "snowman", "socks", "spider", "spoon", "star", "sun", "swing", "tree",
            "truck", "turtle", "water", "web", "whale", "worm"
    };

    public static final String[] WORDS_ARRAY_MED = {
            "taxi", "standing-ovation", "alarm clock", "tool", "banana-peel",
            "flagpole", "money", "wallet", "ballpoint-pen", "sunburn",
            "wedding-ring", "spy", "babysitter", "aunt", "acne", "bib",
            "puzzle", "piece", "pawn", "astronaut", "tennis", "shoes",
            "blue", "jeans", "twig", "outer", "space", "banister",
            "batteries", "doghouse", "campsite", "plumber", "bedbug",
            "throne", "tiptoe", "log", "mute", "pogo", "stick", "stoplight",
            "ceiling-fan", "bedspread", "bite", "stove", "windmill", "nightmare",
            "stripe", "spring", "wristwatch", "eat", "matchstick", "gumball",
            "bobsled", "bonnet", "flock", "sprinkler", "living-room", "laugh",
            "snuggle", "sneeze", "bud", "elf", "headache", "slam-dunk", "saddle",
            "ironing-board", "bathroom", "scale", "kiss", "shopping-cart",
            "shipwreck", "funny", "glide", "lamp", "candlestick", "grandfather",
            "rocket", "home", "movies", "seesaw", "rollerblades", "smog", "grill",
            "goblin", "coach", "claw", "cloud", "shelf", "recycle", "glue-stick",
            "Christmas", "front-porch", "robot", "foil", "rib", "robe", "crumb",
            "paperback", "hurdle", "rattle", "fetch", "date", "iPod", "dance",
            "cello", "flute", "dock", "prize", "dollar", "puppet", "brass", "firefighter",
            "huddle", "easel", "pigpen", "bunk-bed", "bowtie", "fiddle", "dentist",
            "baseboards", "letter-opener", "photographer", "magic", "Old-Spice", "monster"
    };

    public static final String[] WORDS_ARRAY_HARD = {
            "abruptly", "absurd", "abyss", "affix", "askew", "avenue", "awkward", "axiom",
            "azure", "bagpipes", "bandwagon", "banjo", "bayou", "beekeeper", "bikini",
            "blitz", "blizzard", "boggle", "bookworm", "boxcar", "boxful", "buckaroo",
            "buffalo", "buffoon", "buxom", "buzzard", "buzzing", "buzzwords", "caliph",
            "cobweb", "cockiness", "croquet", "crypt", "curacao", "cycle", "daiquiri",
            "dirndl", "disavow", "dizzying", "duplex", "dwarves", "embezzle", "equip",
            "espionage", "exodus", "faking", "fishhook", "fixable", "fjord",
            "flapjack", "flopping", "fluffiness", "flyby", "foxglove", "frazzled",
            "frizzled", "fuchsia", "funny", "gabby", "galaxy", "galvanize", "gazebo",
            "gizmo", "glowworm", "glyph", "gnarly", "gnostic", "gossip",
            "grogginess", "haiku", "haphazard", "hyphen", "iatrogenic", "icebox",
            "injury", "ivory", "ivy", "jackpot", "jaundice", "jawbreaker", "jaywalk",
            "jazziest", "jazzy", "jelly", "jigsaw", "jinx", "jiujitsu", "jockey",
            "jogging", "joking", "jovial", "joyful", "juicy", "jukebox", "jumbo",
            "kayak", "kazoo", "keyhole", "khaki", "kilobyte", "kiosk", "kitsch",
            "kiwifruit", "klutz", "knapsack", "larynx", "lengths", "lucky", "luxury",
            "lymph", "marquis", "matrix", "megahertz", "microwave", "mnemonic", "mystify",
            "naphtha", "nightclub", "nowadays", "numbskull", "nymph", "onyx", "ovary",
            "oxidize", "oxygen", "pajama", "peekaboo", "phlegm", "pixel", "pizazz",
            "pneumonia", "polka", "pshaw", "psyche", "puppy", "puzzling", "quartz",
            "queue", "quips", "quixotic", "quiz", "quizzes", "quorum", "razzmatazz",
            "rhubarb", "rhythm", "rickshaw", "schnapps", "scratch", "shiv", "snazzy",
            "sphinx", "spritz", "squawk", "staff", "strength", "strengths", "stretch",
            "stronghold", "stymied", "subway", "swivel", "syndrome", "thriftless",
            "thumbscrew", "topaz", "transcript", "transgress", "transplant",
            "twelfth", "unknown", "unworthy", "unzip", "uptown", "vaporize",
            "vixen", "vodka", "voodoo", "vortex", "voyeurism", "walkway", "waltz", "wave",
            "wavy", "waxy", "wellspring", "wheezy", "whiskey", "whizzing", "whomever",
            "wimpy", "witchcraft", "wizard", "woozy", "wristwatch", "wyvern", "xylophone",
            "yachtsman", "yippee", "yoked", "youthful", "yummy", "zephyr", "zigzag",
            "zigzagging", "zilch", "zipper", "zodiac", "zombie"
    };

    public static String stringArt1() {
        String art1 = "+---+\n" +
                "  |   |\n" +
                "      |\n" +
                "      |\n" +
                "      |\n" +
                "      |\n" +
                "=============";
        return art1;
    }
    public static String stringArt2() {

        String art2 = "+---+\n" +
                "  |   |\n" +
                "  O   |\n" +
                "      |\n" +
                "      |\n" +
                "      |\n" +
                "=============";
        return art2;
    }

    public static String stringArt3() {

        String art3 = "+---+\n" +
                "  |   |\n" +
                "  O   |\n" +
                "  |   |\n" +
                "      |\n" +
                "      |\n" +
                "=============";
        return art3;
    }

    public static String stringArt4() {
        String art4 = "  +---+\n" +
                "  |   |\n" +
                "  O   |\n" +
                " /|   |\n" +
                "      |\n" +
                "      |\n" +
                "=============";
        return art4;
    }
    public static String stringArt5() {

        String art5 = "+---+\n" +
                "  |   |\n" +
                "  O   |\n" +
                " /|\\  |\n" +
                "      |\n" +
                "      |\n" +
                "=============";
        return art5;
    }
    public static String stringArt6() {

        String art6 = "+---+\n" +
                "  |   |\n" +
                "  O   |\n" +
                " /|\\  |\n" +
                " /    |\n" +
                "      |\n" +
                "=============";
        return art6;
    }
    public static String stringArt7() {

        String art7 = "+---+\n" +
                "  |   |\n" +
                "  O   |\n" +
                " /|\\  |\n" +
                " / \\  |\n" +
                "      |\n" +
                "=============";
        return art7;
    }

    public static String stringArt8() {

        String art8 = "+---+\n" +
                "  |   |\n" +
                "  X   |\n" +
                " /|\\  |\n" +
                " / \\  |\n" +
                "      |\n" +
                "=============";
        return art8;
    }

    public static String lose1() {
        String loseArt1 = "    .-\"\"\"\"\"\"-.\n" +
                "   .'          '.\n" +
                "  /   O      O   \\\n" +
                " :           `    :\n" +
                " |                |\n" +
                " :    .------.    :\n" +
                "  \\  '        '  /\n" +
                "   '.          .'\n" +
                "     '-......-'";
    return loseArt1;
    }

    public static String lose2() {
        String loseArt2 = " |\\ | |  ||\\ \\ /(_~     |~)|_~|\\/||_~|\\/||~)|_~|~)\n" +
                "     |~\\|_|/\\||~\\ | ,_)     |~\\|__|  ||__|  ||_)|__|~\\\n" +
                "\n" +
                "        \\ //~\\| |    |\\ |~)|_~    | ||\\ ||/~\\| ||_~\n" +
                "         | \\_/\\_/    |~\\|~\\|__    \\_/| \\||\\_X\\_/|__\n" +
                "\n" +
                "      (J U S T   L I K E   E V E R Y O N E   E L S E)\n" +
                "      _____         _____         _____         _____\n" +
                "    .'     '.     .'     '.     .'     '.     .'     '.\n" +
                "   /  o   o  \\   /  o   o  \\   /  o   o  \\   /  o   o  \\\n" +
                "  |           | |           | |           | |           |\n" +
                "  |  \\     /  | |  \\     /  | |  \\     /  | |  \\     /  |\n" +
                "   \\  '---'  /   \\  '---'  /   \\  '---'  /   \\  '---'  /\n" +
                "    '._____.'     '._____.'     '._____.'     '._____.'\n" +
                "      _____         _____         _____         _____\n" +
                "    .'     '.     .'     '.     .'     '.     .'     '.\n" +
                "   /  o   o  \\   /  o   o  \\   /  o   o  \\   /  o   o  \\\n" +
                "  |           | |           | |           | |           |\n" +
                "  |  \\     /  | |  \\     /  | |  \\     /  | |  \\     /  |\n" +
                "   \\  '---'  /   \\  '---'  /   \\  '---'  /   \\  '---'  /\n" +
                "    '._____.'     '._____.'     '._____.'     '._____.'\n" +
                "      _____         _____         _____         _____\n" +
                "    .'     '.     .'     '.     .'     '.     .'     '.\n" +
                "   /  o   o  \\   /  o   o  \\   /  o   o  \\   /  o   o  \\\n" +
                "  |           | |           | |           | |           |\n" +
                "  |  \\     /  | |  \\     /  | |  \\     /  | |  \\     /  |\n" +
                "   \\  '---'  /   \\  '---'  /   \\  '---'  /   \\  '---'  /\n" +
                "    '._____.'     '._____.'     '._____.'     '._____.'\n" +
                "      _____         _____         _____         _____\n" +
                "    .'     '.     .'     '.     .'     '.     .'     '.\n" +
                "   /  o   o  \\   /  o   o  \\   /  o   o  \\   /  o   o  \\\n" +
                "  |           | |           | |           | |           |\n" +
                "  |  \\     /  | |  \\     /  | |  \\     /  | |  \\     /  |\n" +
                "   \\  '---'  /   \\  '---'  /   \\  '---'  /   \\  '---'  /\n" +
                "    '._____.'     '._____.'     '._____.'     '._____.'\n" +
                "      _____         _____         _____         _____\n" +
                "    .'     '.     .'     '.     .'     '.     .'     '.\n" +
                "   /  o   o  \\   /  o   o  \\   /  o   o  \\   /  o   o  \\\n" +
                "  |           | |           | |           | |           |\n" +
                "  |  \\     /  | |  \\     /  | |  \\     /  | |  \\     /  |\n" +
                "   \\  '---'  /   \\  '---'  /   \\  '---'  /   \\  '---'  /\n" +
                "    '._____.'     '._____.'     '._____.'     '._____.'";
        return loseArt2;
    }

    public static String lose3() {
        String loseArt3 = "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$'               `$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$  \n" +
                "$$$$$$$$$$$$$$$$$$$$$$$$$$$$'                   `$$$$$$$$$$$$$$$$$$$$$$$$$$$$\n" +
                "$$$'`$$$$$$$$$$$$$'`$$$$$$!                       !$$$$$$'`$$$$$$$$$$$$$'`$$$\n" +
                "$$$$  $$$$$$$$$$$  $$$$$$$                         $$$$$$$  $$$$$$$$$$$  $$$$\n" +
                "$$$$. `$' \\' \\$`  $$$$$$$!                         !$$$$$$$  '$/ `/ `$' .$$$$\n" +
                "$$$$$. !\\  i  i .$$$$$$$$                           $$$$$$$$. i  i  /! .$$$$$\n" +
                "$$$$$$   `--`--.$$$$$$$$$                           $$$$$$$$$.--'--'   $$$$$$\n" +
                "$$$$$$L        `$$$$$^^$$                           $$^^$$$$$'        J$$$$$$\n" +
                "$$$$$$$.   .'   \"\"~   $$$    $.                 .$  $$$   ~\"\"   `.   .$$$$$$$\n" +
                "$$$$$$$$.  ;      .e$$$$$!    $$.             .$$  !$$$$$e,      ;  .$$$$$$$$\n" +
                "$$$$$$$$$   `.$$$$$$$$$$$$     $$$.         .$$$   $$$$$$$$$$$$.'   $$$$$$$$$\n" +
                "$$$$$$$$    .$$$$$$$$$$$$$!     $$`$$$$$$$$'$$    !$$$$$$$$$$$$$.    $$$$$$$$\n" +
                "$JT&yd$     $$$$$$$$$$$$$$$$.    $    $$    $   .$$$$$$$$$$$$$$$$     $by&TL$\n" +
                "                                 $    $$    $\n" +
                "                                 $.   $$   .$\n" +
                "                                 `$        $'\n" +
                "                                  `$$$$$$$$'";
        return loseArt3;
    }

    public static String byeArt() {
        String byeArt = "| |               \n" +
                "| |__  _   _  ___ \n" +
                "| '_ \\| | | |/ _ \\\n" +
                "| |_) | |_| |  __/\n" +
                "|_.__/ \\__, |\\___|\n" +
                "        __/ |     \n" +
                "       |___/ ";
    return byeArt;
    }

    public static String helloArt() {
        String helloArt = "┏┓┏┳━━┳┓┏┓┏━━━━┓\n" +
                "┃┗┛┃━━┫┃┃┃┃ ╭╮ ┃\n" +
                "┃┏┓┃━━┫┃┫┗┫ ╰╯ ┃\n" +
                "┗┛┗┻━━┻━┻━┻━━━━┛";
        return helloArt;
    }
}

