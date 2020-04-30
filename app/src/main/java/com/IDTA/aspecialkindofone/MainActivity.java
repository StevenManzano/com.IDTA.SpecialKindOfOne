package com.IDTA.aspecialkindofone;
import android.annotation.SuppressLint;
import android.content.SharedPreferences;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Handler;
import android.os.SystemClock;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.BounceInterpolator;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.VideoView;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {
    DecimalFormat currency = new DecimalFormat("$### ");
    DecimalFormat noCurrency = new DecimalFormat("### ");

    int avatar=0;
    String videoPath;
    boolean spanish = false;
    int paymentChoice;
    boolean paymentQuestion = false;
    boolean declaredPayment=false;
    int merchandiseValue=0;
    boolean displaySum = false;
    boolean declaredAlgebraicDifference = false;
    int numberOfPages;
    int avatarList=0;
    boolean merchandiseQuestion=false;
    int superLevel;
    boolean declaredMerchandise=false;
    int lastButtonImage;
    boolean declaredHalfWarAnswer = false;
    boolean declaredHalfWar = false;
    MediaController mediaController;
    boolean halfWarAnswer = false;
    boolean odd;
    boolean waitForEnter=false;
    boolean halfWarQuestion = false;
    int opponentMerchandiseTotal = 0;
    String saveGame;
    int[] saveNum;
    int mNothing;
    boolean videoTime=false;
    int mOne;
    int mTwo;
    boolean enterOnly = false;
    int opponentSuccessFactor = 0;
    int successFactor = 0;
    int mThree;
    boolean debit=false;
    boolean change=false;
    boolean playAgainstQuestion = false;
    boolean passLevelQuestion = false;
    int opponentSuccessRate=0;
    boolean algebraAnswer = false;
    boolean declaredAlgebraAnswer = false;
    boolean algebraQuestion = false;
    boolean algebraDeclared =false;
    ImageView signView;
    int avatar2;
    boolean contestantQuestion = false;
    int[] newNum;
    int terms;
    boolean declaredContestantAvatar=false;
    boolean declaredOdd=true;
    boolean opponent = false;
    boolean noMagnitude=false;
    int rateNumber;
    int currentChange = 0;
    boolean contest;
    boolean successRateQuestion = false;
    int algebraInt;
    boolean declaredSuccessRate=false;
    int successRate=0;
    Animation rotateA;
    Animation spinOut;
    Animation spinOutLeft;
    Animation spinIn;
    Animation spinInLeft;
    Animation pop;
    int mFour;
    int correctMathWarAnswers;
    boolean mathWarAnswer = false;
    boolean declaredMathWarAnswer = false;
    int mFive;
    int onlyAnswer;
    Animation enterB;
    Animation anim1;
    long elapsedTime;
    String argument1;
    int wrongAnswerMathWar=0;
    boolean moveTotal=false;
    boolean warHasStarted=false;
    long mathWarStartTime;
    boolean dontChooseKeys = false;
    boolean mathWarQuestion = false;
    boolean declaredMathWar = false;
    int enterResource =R.drawable.enter;
    int debitcard;
    int[] merchandiseNum={1,2,3,4,5,6,1,2,3,4};
    int merchandise1=0;
    int merchandise2=0;
    int merchandise3=0;
    int merchandise4=0;
    int merchandise5=0;
    int merchandise6=0;
    int merchandise7=0;
    int merchandise8=0;
    int merchandise9=0;
    int merchandise10=0;
    int merchandiseTotal=0;
    String game;
    int balance;
    boolean waitForUnit=false;
    boolean equalsView = false;
    boolean changeOrDebitQuestion = false;
    boolean declaredchangeOrDebit = false;
    boolean hasDollars;
    boolean hasMinus;
    int[] goodJob;
    boolean chooseAvatar =false;
    boolean avatarQuestion = false;
    int[] buttons;
    boolean declaredAvatar = false;
    boolean correctVarity = false;
    boolean correctUnit = false;
    boolean hint = false;
    boolean correctDirection =false;
    boolean correctParity = false;
    int correctInt;

    ImageView from;
    boolean greaterQuestion = false;
    boolean directionQuestion = false;
    int mSix;
    int mSeven;
    int mEight;
    int mNine;
    int merchandiseImage=R.drawable.yes;
    boolean plus_minus=false;
    String absCorrectString = "11";
    int sameSignStatus;
    int correctAnswer;
    int direction1;
    int greatest;
    int direction2;
    int direction=2;
    int low;
    int high;
    int firstRanNum;
    int secondRanNum;
    int firstRanNumAbs;
    int secondRanNumAbs;
    boolean correctKey = false;
    String old=" ";
    int correctTerm;
    int g=0;
    int[] num = {0,1,2,3,4,5,6,7,8,9};
    int smaller;
    int greater;
    int combinationType=3;
    boolean clearInput = false;
    boolean yesAnswer;
    ImageView lastButton;

    private void StoreLevel(int l) {
        SharedPreferences sharedPreferences = getSharedPreferences("avatar"+avatar, MODE_PRIVATE);
        SharedPreferences.Editor mEditor = sharedPreferences.edit();
        mEditor.putInt("Level", l);
        mEditor.apply();
    }

    private void StoreSuccessRate() {
        SharedPreferences sharedPreferences = getSharedPreferences("avatar"+avatar, MODE_PRIVATE);
        SharedPreferences.Editor mEditor = sharedPreferences.edit();
        mEditor.putInt("Rate", successRate);
        mEditor.apply();
    }
    private void StoreSuccessRate2() {
        SharedPreferences sharedPreferences = getSharedPreferences("avatar"+avatar2, MODE_PRIVATE);
        SharedPreferences.Editor mEditor = sharedPreferences.edit();
        mEditor.putInt("Rate", opponentSuccessRate);
        mEditor.apply();
    }
    private int GetLevel() {
        SharedPreferences sharedPreferences = getSharedPreferences("avatar"+avatar, MODE_PRIVATE);
        return sharedPreferences.getInt("Level", 1);
    }
    private int GetSuccessRate() {
        SharedPreferences sharedPreferences = getSharedPreferences("avatar"+avatar, MODE_PRIVATE);
        return sharedPreferences.getInt("Rate", 1);
    }

    private void StoreAvatar(int l) {
        SharedPreferences sharedPreferences = getSharedPreferences("Preferences", MODE_PRIVATE);
        SharedPreferences.Editor mEditor = sharedPreferences.edit();
        mEditor.putInt("Avatar", l);
        mEditor.apply();
    }
    private int GetAvatar() {
        SharedPreferences sharedPreferences = getSharedPreferences("Preferences", MODE_PRIVATE);
        return sharedPreferences.getInt("Avatar", 1);
    }
    int level;

    boolean declaredCombine = false;
    boolean declaredHalf = false;
    boolean combineQuestion = false;
    boolean sumOrDifferenceQuestion=false;
    boolean declaredSumOrDifference=false;
    long delay=100;
    boolean signOfGreaterQuestion=false;
    Timer timer;
    boolean declaredSignOfGreater=false;
    boolean declaredGreater = false;
    int absCorrect=0;
    boolean magnitudeQuestion=false;
    Integer words;
    boolean declaredDirection = false;
    boolean halfQuestion=false;
    String useButtons="Direction";
    int parity=3;
    boolean declaredUnit=false;
    boolean unitQuestion=false;
    boolean noQuestion=true;
    boolean levelQuestion = false;
    boolean declaredLevel=false;
    boolean signOfCombinationQuestion =false;
    boolean declaredSignOfCombination=false;
    boolean unitOfDifferenceQuestion=false;
    boolean declaredUnitOfDifference=false;
    boolean magnitudeOfCombinationQuestion=false;
    boolean declaredMagnitudeOfCombination=false;
    MediaPlayer mp;
    boolean declaredHowMany=false;
    boolean howManyQuestion=false;
    boolean declaredMagnitude=false;
    boolean parityQuestion = false;
    private long mLastClickTime=0;
    int parityState = 2;
    boolean declaredParity=false;
    int score_1=0;
    int score_2=0;
    int score_3=0;
    int score_4=0;
    int score_5=0;
    int score_6=0;
    int score_7=0;
    int score_8=0;
    int score_9=0;
    int score_10=0;
    int lastGrade= 0;
    int image_10;
    int image_9;
    int image_8;
    int image_7;
    int image_6;
    int image_5;
    int image_4;
    int image_3;
    int image_2;
    int image_1;
    ArrayList<Integer>playlist;

    public static int ShuffleArray(int[] array){
        try {
            int len = array.length;
        for (int i=0;i<len;i++){
            int s = i+(int)(Math.random()*(len-i));
            int temp = array[s];
            array[s]=array[i];
            array[i] = temp;
        }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return array[0];
    }
    public static int RandomGen(int low,int high){
        return (int)(Math.random()*(1+high-low)+low);
    }


    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        try {

            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            playlist = new ArrayList<>();
            anim1 = AnimationUtils.loadAnimation(this, R.anim.alpha);
            enterB = AnimationUtils.loadAnimation(this, R.anim.enter_blinklink);
            rotateA = AnimationUtils.loadAnimation(this, R.anim.rotate);
            spinOut = AnimationUtils.loadAnimation(this, R.anim.spin_out);
            spinOutLeft = AnimationUtils.loadAnimation(this, R.anim.spin_out_left);
            spinIn=AnimationUtils.loadAnimation(this,R.anim.spin_in);
            spinInLeft=AnimationUtils.loadAnimation(this,R.anim.spin_in_left);
            pop = AnimationUtils.loadAnimation(this, R.anim.scale_out);

            final TextView tOpponentRate=findViewById(R.id.opponentScoreview);
            final ImageView enterView = findViewById(R.id.enterView);
            final ImageView iMinus2 = findViewById(R.id.minusView2);
            final ImageView iTerm12 = findViewById(R.id.term12);
            final ImageView iPlus2 = findViewById(R.id.plusView2);
            final ImageView iTerm22 = findViewById(R.id.term22);
            final ImageView iEquals2 = findViewById(R.id.equals2);
            final ImageView iArg1 = findViewById(R.id.arg1imageView);
            final ImageView iArg2 = findViewById(R.id.arg2imageView);
            final ImageView iMinus = findViewById(R.id.minusView);
            final ImageView iTerm1 = findViewById(R.id.term1);
            final ImageView iPlus = findViewById(R.id.plusView);
            final ImageView iTerm2 = findViewById(R.id.term2);
            final ImageView iEquals = findViewById(R.id.equals);
            final ImageView iBottomRight = findViewById(R.id.bottomRightImageView);
            final ImageView iBottomLeft = findViewById(R.id.bottomLeftImageView);
            final ImageView iNothing = findViewById(R.id.nothingImageView);
            final ImageView iOne = findViewById(R.id.oneImageView);
            final ImageView iTwo = findViewById(R.id.twoImageView);
            final ImageView iThree = findViewById(R.id.threeImageView);
            final ImageView iFour = findViewById(R.id.fourImageView);
            final ImageView iFive = findViewById(R.id.fiveImageView);
            final ImageView iSix = findViewById(R.id.sixImageView);
            final ImageView iSeven = findViewById(R.id.sevenImageView);
            final ImageView iEight = findViewById(R.id.eightImageView);
            final ImageView iNine = findViewById(R.id.nineImageView);
            final ImageView iDollar = findViewById(R.id.dollar_imageView);
            final ImageView iLevel = findViewById(R.id.levelButtonView);

            final ImageView sign = findViewById(R.id.signView);
            final ImageView therm = findViewById(R.id.thermView);
            final ImageView score1 = findViewById(R.id.wrong1View);
            final ImageView score2 = findViewById(R.id.wrong2View);
            final ImageView score3 = findViewById(R.id.wrong3View);
            final ImageView score4 = findViewById(R.id.wrong4View);
            final ImageView score5 = findViewById(R.id.wrong5View);
            final ImageView score6 = findViewById(R.id.wrong6View);
            final ImageView score7 = findViewById(R.id.wrong7View);
            final ImageView score8 = findViewById(R.id.wrong8View1);
            final ImageView score9 = findViewById(R.id.wrong9View);
            final ImageView score10 = findViewById(R.id.wrong10View);
            final ImageView rightView = findViewById(R.id.rightImageView);
            final ImageView leftView = findViewById(R.id.leftImageView);
            final VideoView videoV = findViewById(R.id.videoScreen);
            final int[] videoRewards = {R.raw.poor};
            final ImageButton bzero = findViewById(R.id.nothingButton);
            final ImageButton bOne = findViewById(R.id.oneButton);
            final ImageButton btwo = findViewById(R.id.twoButton);
            final ImageButton bthree = findViewById(R.id.threeButton);
            final ImageButton bfour = findViewById(R.id.fourButton);
            final ImageButton bfive = findViewById(R.id.fiveButton);
            final ImageButton bsix = findViewById(R.id.sixButton);
            final ImageButton bseven = findViewById(R.id.sevenButton);
            final ImageButton beight = findViewById(R.id.eightButton);
            final ImageButton bnine = findViewById(R.id.nineButton);
            final ImageButton bleft = findViewById(R.id.leftButton);
            final ImageButton bright = findViewById(R.id.rightButton);
            final ImageButton beven = findViewById(R.id.bottomLeftButton);
            final ImageButton bodd = findViewById(R.id.bottomRightButton);
            final ImageButton blevel = findViewById(R.id.levelButton);
            final ImageButton bdelete = findViewById(R.id.deleteButton);
            final ImageButton bup = findViewById(R.id.upButton);
            final ImageButton bdecimal = findViewById(R.id.decimalButton);
            final ImageButton bchange = findViewById(R.id.changeButton);
            final ImageButton benter = findViewById(R.id.enterButton);

            final TextView input = findViewById(R.id.inputView);
            final TextView arg1 = findViewById(R.id.firstArgView);
            final TextView arg2 = findViewById(R.id.secArgView);
            final TextView memory = findViewById(R.id.memView);
            final TextView vLevel = findViewById(R.id.levelView);
            final TextView tWallet = findViewById(R.id.walletView);
            final TextView tDebit = findViewById(R.id.debitView);
            final TextView tMerchandise = findViewById(R.id.merchandiseView);
            final int[] cashOrDebitWords = {R.raw.give_you_or_debit, R.raw.change_or_debit, R.raw.wallet_or_bank};
            final int[] thermGrade = {R.drawable.thermometer1, R.drawable.thermometer2, R.drawable.thermometer3, R.drawable.thermometer4, R.drawable.thermometer5, R.drawable.thermometer5};

            final int[] oneMerchandise = {R.drawable.mnms1, R.drawable.hotwheel1, R.drawable.snickers1};
            final int[] twoMerchandise = {R.drawable.doritos2, R.drawable.coke2, R.drawable.hubabuba2};
            final int[] threeMerchandise = {R.drawable.hair_bands3, R.drawable.boys_gloves3, R.drawable.poca_socks3};
            final int[] fourMerchandise = {R.drawable.pickup_sticks4, R.drawable.hairbrush4, R.drawable.soccer_ball4, R.drawable.tamborine4};
            final int[] fiveMerchandise = {R.drawable.jumprope5, R.drawable.goldfish5, R.drawable.crayolamarkers5};
            final int[] sixMerchandise = {R.drawable.girls_slippers6, R.drawable.jenga6, R.drawable.binoculars6};
            final int[] sevenMerchandise = {};
            final int[] eightMerchandise = {};
            final int[] nineMerchandise = {};
            final int[] laserSounds = {R.raw.laser2, R.raw.laser4, R.raw.laser5, R.raw.laser6, R.raw.laser8,  R.raw.laser11, R.raw.laser14, R.raw.shoot};
            final int[] directionExplained = {R.raw.put_into_wallet, R.raw.direction_bank, R.raw.direction_cashier};
            final int[] directionQuality = {R.raw.plus_posative, R.raw.plus_zero_minus_zero, R.raw.plus_nothing_same_as_minus_nothing, R.raw.sign_zero, R.raw.three_signs, R.raw.negative_less_than, R.raw.posative_greater_than, R.raw.direction_signs, R.raw.no_sign, R.raw.no_sign_is_the_same, R.raw.minus_negative};
            final int[] toPay = {R.raw.how_much_to_pay_clerk, R.raw.to_pay_salesperson, R.raw.to_pay_cashier};
            final int[] unitIs = {R.raw.lable_tells_what_kind, R.raw.unit_quality, R.raw.unit_imaginary, R.raw.unit_more_value, R.raw.unit_lable, R.raw.lable_real};
            final int[] parityIs = {R.raw.parity_quality, R.raw.parity_whole_number, R.raw.parity_whole_half, R.raw.parity_cant_be_divided, R.raw.parity_cut_in_half, R.raw.parity_one_half};
            final int[] magnitudeIs = {R.raw.magnitude_quality, R.raw.magnitude_howmany, R.raw.magnitude_numbers};
            final int[] wantToBuy = {R.raw.what_buy_brother, R.raw.what_buy_sister, R.raw.what_buy_cousin, R.raw.what_buy_friend,};
            
            final int[] answers = {R.raw.zeros, R.raw.ones, R.raw.twos, R.raw.threes, R.raw.fours, R.raw.fives, R.raw.sixes, R.raw.sevens, R.raw.eights, R.raw.nines, R.raw.tens, R.raw.tens, R.raw.twelves, R.raw.thirteens, R.raw.fourteens, R.raw.fifteens, R.raw.sixteens, R.raw.seventeens, R.raw.eighteens, R.raw.nineteens, R.raw.twenties};
            final int[] minusAnswers={R.raw.zeros,R.raw.minus_ones,R.raw.minus_twos,R.raw.minus_threes,R.raw.minus_fours,R.raw.minus_fives,R.raw.minus_sixes,R.raw.minus_sevens,R.raw.minus_eights,R.raw.minus_nines,R.raw.minus_tens,R.raw.minus_elevens,R.raw.minus_twelves,R.raw.minus_thirteens,R.raw.minus_fourteens,R.raw.minus_fifteens,R.raw.minus_sixteens,R.raw.minus_seventeens,R.raw.minus_eighteens,R.raw.minus_nineteens,R.raw.minus_twenties};
            final int[] signOfGreaterQuestions = {R.raw.direction_greatest_magnitude, R.raw.what_is_the_sign_term_greatest_magnitude};
            final int[] mathWarHints = {R.raw.the_sign_is_already_correct, R.raw.just_enter_unit, R.raw.no_sign_is_the_same, R.raw.for_zero_the_sign_is_not_important};
            final int[] howManyQuestions = {R.raw.one_or_two_terms, R.raw.how_many_terms_on_screen};
            final int[] nobody = {R.raw.good_job, R.raw.wow, R.raw.youre_getting_it, R.raw.excelent, R.raw.your_doing_verry_well, R.raw.wow_that_great,};
            final int[] termIs = {R.raw.picture_to_a_dog, R.raw.terms_out_symbols, R.raw.terms_represent_real_values, R.raw.if_you_were_an_animal, R.raw.term_is_value, R.raw.term_add_or_subtract, R.raw.terms_red_letters, R.raw.term_two_red_things, R.raw.magnitude_quality, R.raw.unit_quality, R.raw.direction_quality, R.raw.parity_quality};
            
            final int[] sophia = {R.raw.good_job, R.raw.sophia_great, R.raw.sophia_impressed, R.raw.sophia_smart, R.raw.sophia_well};
            final int[] brishon = {R.raw.brishon_awsome, R.raw.good_job, R.raw.wow, R.raw.excelent, R.raw.your_doing_verry_well, R.raw.wow_that_great};
            final int[] getsi = {R.raw.getsi_great,R.raw.getsi_proud,R.raw.getsi_i_love_you_grandpa, R.raw.getsi_thanks_grandpa,};
            final int[] dogo = {R.raw.dogo_really_good,R.raw.dogo_genius, R.raw.good_job, R.raw.wow, R.raw.youre_getting_it, R.raw.dogo_excelent, };
            final int[] harmony = {R.raw.harmony_proud, R.raw.good_job, R.raw.wow, R.raw.youre_getting_it, R.raw.excelent, R.raw.your_doing_verry_well, R.raw.wow_that_great};
            final int[] mateo = {R.raw.mateo_amazing, R.raw.good_job, R.raw.wow, R.raw.youre_getting_it, R.raw.excelent, R.raw.your_doing_verry_well, R.raw.wow_that_great};
            final int[] sergio = {R.raw.sergio_awsome, R.raw.good_job, R.raw.wow, R.raw.youre_getting_it, R.raw.excelent, R.raw.your_doing_verry_well, R.raw.wow_that_great};
            final int[] jazel = {R.raw.jazel_good_job, R.raw.good_job, R.raw.wow, R.raw.youre_getting_it, R.raw.excelent, R.raw.your_doing_verry_well, R.raw.wow_that_great};
            final int[] lorenzo = {R.raw.lorenzo_doing_well, R.raw.lorenzo_genious, R.raw.lorenzo_getting_it, R.raw.lorenzo_good_job, R.raw.lorenzo_right, R.raw.lorenzo_that_great};
            final int[] chanell = {R.raw.chanell_doing_well, R.raw.chanell_genious, R.raw.chanell_gettin_it, R.raw.chanell_good_job, R.raw.chanell_right, R.raw.chanell_that_great};
            final int[] darren = {R.raw.darren_great, R.raw.good_job, R.raw.wow, R.raw.youre_getting_it, R.raw.excelent, R.raw.your_doing_verry_well, R.raw.wow_that_great};
            final int[] qasti = {R.raw.qasti_good_job, R.raw.qasti_good_job2, R.raw.wow, R.raw.youre_getting_it, R.raw.excelent, R.raw.your_doing_verry_well, R.raw.wow_that_great};
            final int[] lanea = {R.raw.lanea_smart, R.raw.good_job, R.raw.wow, R.raw.youre_getting_it, R.raw.excelent, R.raw.your_doing_verry_well, R.raw.wow_that_great};
            final int[] caleb = {R.raw.caleb_congratulations, R.raw.good_job, R.raw.wow, R.raw.youre_getting_it, R.raw.excelent, R.raw.your_doing_verry_well, R.raw.wow_that_great};
            final int[] juan = {R.raw.juan_asombroso, R.raw.good_job, R.raw.wow, R.raw.youre_getting_it, R.raw.excelent, R.raw.your_doing_verry_well, R.raw.wow_that_great};
            final int[] mariana = {R.raw.mariana_buen_trabajo, R.raw.good_job, R.raw.wow,  R.raw.willy_impressed,  };
            final int[] willy = {R.raw.willy_impressed, R.raw.willy_good_job, R.raw.willy_wow,R.raw.willy_right, R.raw.willy_smart};
            final int[] peter = {R.raw.peter_good_job, R.raw.good_job, R.raw.wow, R.raw.youre_getting_it, R.raw.excelent, R.raw.your_doing_verry_well, R.raw.wow_that_great};
            final int[] ember = {R.raw.ember_intelegent, R.raw.good_job, R.raw.wow, R.raw.youre_getting_it, R.raw.excelent, R.raw.your_doing_verry_well, R.raw.wow_that_great};
            final int[] darrell = {R.raw.darrell_perfecto, R.raw.darrell_correcto, R.raw.darrell_intelegente,R.raw.darrell_correcto,R.raw.nietos_son_listos, };
            final int[] chelsy={R.raw.chelsy_hi_granpa,R.raw.nietos_son_listos,R.raw.asombroso,R.raw.buen_trabajo};
            final int[] daphne={R.raw.dafni_grandpa,R.raw.dafni_grandpa_buy,R.raw.nietos_son_listos,R.raw.asombroso};

            final int[] avatarNum = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
            final int[] avatarNum1 = {10, 11, 12, 13, 14, 15, 16, 17, 18, 19};
            final int[] avatarNum2 = {20, 21,12, 13, 14, 15, 16, 17, 18, 19};
            final String[] avatarsName = {"Lorenzo","Chanel","Sophia","Brishon","Harmony","Jazel","Mateo","Getsi","Sergio","Dogo","Darren","Qasti","Lanea","Caleb","Juan","Mariana","Willy","Ember","Peter","Darrell","Chelsi","Dafni","Samara","Tani"};
            final int[] yourAvatar = {R.raw.name_lorenzo,R.raw.name_chanell,R.raw.sophia,R.raw.brishon,R.raw.harmony,R.raw.jazel,R.raw.mateo,R.raw.getsy,R.raw.sergio,R.raw.dogo,R.raw.darren,R.raw.qasti,R.raw.lanea,R.raw.caleb,R.raw.juan,R.raw.mariana,R.raw.willy,R.raw.ember,R.raw.peter,R.raw.darrell,R.raw.chelsy,R.raw.dafni,R.raw.tani};
            final int[] avatarKeys = {R.drawable.lorenzo_button, R.drawable.chanell_button, R.drawable.sophia_button, R.drawable.brishon, R.drawable.harmony, R.drawable.jazel, R.drawable.mateo, R.drawable.getsi, R.drawable.sergio, R.drawable.dogo,R.drawable.darren,R.drawable.qasti,R.drawable.lanea,R.drawable.caleb,R.drawable.juan,R.drawable.mariana,R.drawable.wiliam,R.drawable.ember,R.drawable.peter,R.drawable.darrell,R.drawable.chelsi,R.drawable.dafni,R.drawable.samara,R.drawable.tani};
            final int[] whatAvatar = {R.raw.what_avatar, R.raw.choose_avatar};
            final int[] magnitudeOfSmallerOrGreaterTerm = {R.raw.magnitude_greatest_term, R.raw.magnitude_smaller};
            final int[] applause = {R.raw.applause, R.raw.applause2, R.raw.applause3, R.raw.applause4,};
            mediaController =new MediaController(this);
            mediaController.setAnchorView(videoV);
            final int[] zeroButtons = {R.drawable.nothing_button, R.drawable.zero};
            final int[] oneButtons = {R.drawable.one_button, R.drawable.one_small, R.drawable.one_digit};
            final int[] twoButtons = {R.drawable.twobutton, R.drawable.two11, R.drawable.two_hor, R.drawable.two_ver, R.drawable.two_digit};
            final int[] threeButtons = {R.drawable.three_hor, R.drawable.three12, R.drawable.three_vert, R.drawable.three_digit,};
            final int[] fourButtons = {R.drawable.four, R.drawable.four13, R.drawable.four22, R.drawable.four_digit};
            final int[] fiveButtons = {R.drawable.five, R.drawable.five14, R.drawable.five23, R.drawable.five_digit};
            final int[] sixButtons = {R.drawable.six, R.drawable.six15, R.drawable.six24, R.drawable.six33, R.drawable.six_digit};
            final int[] sevenButtons = {R.drawable.seven, R.drawable.seven16, R.drawable.seven25, R.drawable.seven_34, R.drawable.seven_digit};
            final int[] eightButtons = {R.drawable.eight, R.drawable.eight17, R.drawable.eight26, R.drawable.eight35, R.drawable.eight44, R.drawable.eight_digit};
            final int[] nineButtons = {R.drawable.nine,R.drawable.nine18, R.drawable.nine27, R.drawable.nine36, R.drawable.nine45, R.drawable.nine_digit};
            final int[] tenButtons = {R.drawable.ten, R.drawable.ten19, R.drawable.ten28, R.drawable.ten37, R.drawable.ten46, R.drawable.ten55, R.drawable.ten_digit};
            final int[] elevenButtons={R.drawable.eleven,R.drawable.eleven29,R.drawable.eleven38,R.drawable.eleven47,R.drawable.eleven56,R.drawable.eleven_digit};
            final int[] twelveButtons={R.drawable.twelve,R.drawable.twelve39,R.drawable.twelve48,R.drawable.twelve57,R.drawable.twelve_digit};
            final int[] thirteenButtons={R.drawable.thirteen,R.drawable.thirteen49,R.drawable.thirteen58,R.drawable.thirteen67,R.drawable.thirteen_digit};
            final int[] fourteenButtons={R.drawable.fourteen,R.drawable.fourteen59,R.drawable.fourteen68,R.drawable.fourteen77,R.drawable.fourteen_digit};
            final int[] fifteenButtons={R.drawable.fifteen,R.drawable.fifteen69,R.drawable.fifteen78,R.drawable.fifteen_digit};
            final int[] sixteenButtons={R.drawable.sixteen,R.drawable.sixteen79,R.drawable.sixteen88,R.drawable.sixteen_digit};
            final int[] seventeenButtons={R.drawable.seventeen,R.drawable.seventeen89,R.drawable.seventeen_digit};
            final int[] eighteenButtons={R.drawable.eight_button,R.drawable.eighteen99,R.drawable.eighteen_digit};

            final int[] termSymbols = {R.drawable.zero_button, R.drawable.one_dollar, R.drawable.two_dollars, R.drawable.three_button, R.drawable.four_button, R.drawable.five_button, R.drawable.six_button, R.drawable.seven_button, R.drawable.eight_button, R.drawable.nine_button, R.drawable.ten_button, R.drawable.eleven_symbol, R.drawable.twelve_symbol, R.drawable.thirteen_symbol, R.drawable.fourteen_symbol, R.drawable.fifteen_symbol, R.drawable.sixteen_symbol, R.drawable.seventeen_symbol, R.drawable.eighteen_symbol};
            
            final int[] plusNumbers = {R.raw.zero, R.raw.plus_one, R.raw.plus_two, R.raw.plus_three, R.raw.plus_four, R.raw.plus_five, R.raw.plus_six, R.raw.plus_seven, R.raw.plus_eight, R.raw.plus_nine};
            final int[] minusNumbers = {R.raw.zero, R.raw.minus_one, R.raw.minus_two, R.raw.minus_three, R.raw.minus_four, R.raw.minus_five, R.raw.minus_six, R.raw.minus_seven, R.raw.minus_eight, R.raw.minus_nine};
            final int[] magnitudeQuestions = {R.raw.magnitude_difference, R.raw.magnitude_identity, R.raw.magnitude_sum, R.raw.magnitude_of_combination};
            final int[] correctSignOfCombination = {R.raw.sign_of_difference_is_sign_of_greatest, R.raw.sign_of_identity_is_sign_of_greatest, R.raw.sign_of_sum_is_sign_of_greatest, R.raw.opposite_sign_same_magnitude};
            final int[] numbers = {R.raw.nothing, R.raw.one, R.raw.two, R.raw.three, R.raw.four, R.raw.five, R.raw.six, R.raw.seven, R.raw.eight, R.raw.nine, R.raw.ten, R.raw.eleven, R.raw.twelve, R.raw.thirteen, R.raw.fourteen, R.raw.fifteen, R.raw.sixteen, R.raw.seventeen, R.raw.eighteen, R.raw.nineteen, R.raw.twenty, R.raw.twentyone, R.raw.twentytwo, R.raw.twentythree, R.raw.twentyfour, R.raw.twentyfive, R.raw.twentysix, R.raw.twentyseven, R.raw.twentyeight, R.raw.twentynine, R.raw.thirty, R.raw.thirty1, R.raw.thirty2, R.raw.thirty3, R.raw.thirty4, R.raw.thirty5, R.raw.thirty6, R.raw.thirty7, R.raw.thirty8, R.raw.thirty9, R.raw.forty, R.raw.forty1, R.raw.forty2, R.raw.forty3, R.raw.forty4, R.raw.forty5, R.raw.forty6, R.raw.forty7, R.raw.forty8, R.raw.forty9, R.raw.fifty, R.raw.fifty1, R.raw.fifty2, R.raw.fifty3, R.raw.fifty4, R.raw.fifty5, R.raw.fifty6, R.raw.fifty7, R.raw.fifty8, R.raw.fifty9, R.raw.sixty};
            final int[] dollars = {R.raw.no_dollars, R.raw.one_dollar, R.raw.two_dollars, R.raw.three_dollars, R.raw.four_dollars, R.raw.five_dollars, R.raw.six_dollars, R.raw.seven_dollars, R.raw.eight_dolars, R.raw.nine_dollars, R.raw.ten_dollars, R.raw.eleven_dollars, R.raw.twelve_dollars, R.raw.thirteen_dollars, R.raw.forteen_dollars, R.raw.fifteen_dollars, R.raw.sixteen_dollars, R.raw.seventeen_dollars, R.raw.eighteen_dollars, R.raw.nineteen_dollars, R.raw.twenty_dollars};
            final int[] plusDollars = {R.raw.plus_no_dollars, R.raw.plus_one_dollar, R.raw.plus_two_dollars, R.raw.plus_three_dollars, R.raw.plus_four_dollars, R.raw.plus_five_dollars, R.raw.plus_six_dollars, R.raw.plus_seven_dollars, R.raw.plus_eight_dollars, R.raw.plus_nine_dollars, R.raw.plus_ten_dollars, R.raw.plus_eleven_dollars, R.raw.plus_twelve_dollars, R.raw.plus_thirteen_dollars, R.raw.plus_fourteen_dollars, R.raw.plus_fifteen_dollars, R.raw.plus_sixteen_dollars, R.raw.plus_seventeen_dollars, R.raw.plus_eighteen_dollars, R.raw.plus_nineteen_dollars, R.raw.plus_twenty_dollars};
            final int[] minusDollars = {R.raw.minus_no_dollars, R.raw.minus_one_dollar, R.raw.minus_two_dollars, R.raw.minus_three_dollars, R.raw.minus_four_dollars, R.raw.minus_five_dollars, R.raw.minus_six_dollars, R.raw.minus_seven_dollars, R.raw.minus_eight_dollars, R.raw.minus_nine_dollars, R.raw.minus_ten_dollars, R.raw.minus_eleven_dollars, R.raw.minus_twelve_dollars, R.raw.minus_thirteen_dollars, R.raw.minus_fourteen_dollars, R.raw.minus_fifteen_dollars, R.raw.minus_sixteen_dollars, R.raw.minus_seventeen_dollars, R.raw.minus_eighteen_dollars, R.raw.minus_nineteen_dollars, R.raw.minus_twenty_dollars};
            final int[] halfQuestions = {R.raw.what_is_half_of_nothing, R.raw.what_is_half_of_two, R.raw.what_is_half_of_four, R.raw.what_is_half_of_six, R.raw.what_is_half_of_eight, R.raw.what_is_half_of_ten};
            final int[] directionIs = {R.raw.the_direction_is_posative, R.raw.the_direction_is_negative, R.raw.zero_has_no_direction};

            final int[] signOfSumOrDifference = {R.raw.sign_of_difference, R.raw.sign_of_identity, R.raw.sign_of_sum, R.raw.sign_of_combination};
            final int[] sumOrDifference = {R.raw.does_combining_produce_difference, R.raw.does_combining_produce_identity, R.raw.does_combining_produce_sum, R.raw.does_combining_produce_difference};
            final int[] signs = {R.drawable.plus_button, R.drawable.minus_button, R.drawable.zero_button};

            final int[] parityQuestions = {R.raw.what_is_the_parity_term, R.raw.is_the_parity_even_or_odd};
            final int[] num0 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
            final int[] num1 = {0, 1, 2, 0, 0, 0, 0, 0, 0, 0};
            final int[] directionQuestions = {R.raw.what_is_the_direction, R.raw.posative_negative_zero, R.raw.greater_lessthan_zero};
            final int[] questionWords = {R.raw.press_the_question_mark_to_see_if_you_are_right, R.raw.always_question_to_know_what_to_do, R.raw.press_the_question_mark_to_begin};

            avatar = GetAvatar();
            iLevel.startAnimation(enterB);
            enterView.startAnimation(enterB);
            enterOnly = true;
            level = GetLevel();
            String stringLevel = String.valueOf(level);
            vLevel.setText(stringLevel);
            videoV.setMediaController(mediaController);
            mediaController.setAnchorView(videoV);

            iLevel.setImageResource(avatarKeys[avatar]);

            final View.OnClickListener calculatorListener = new View.OnClickListener() {

            int position0,position1,position2,position3,position4,position5,position6,position7,position8,position9;

                private int[] GetFillPosition(int maximum) {
                    position0 = Math.max(maximum - 9,0);
                    position1 = Math.max(maximum - 8,0);
                    position2 = Math.max(maximum - 7,0);
                    position3 = Math.max(maximum - 6,0);
                    position4 = Math.max(maximum - 5,0);
                    position5 = Math.max(maximum - 4,0);
                    position6= Math.max(maximum - 3,0);
                    position7= Math.max(maximum - 2,0);
                    position8= Math.max(maximum - 1,0);
                    position9= Math.max(maximum,0);
                    return new int[]{position0,position1,position2,position3,position4,position5,position6,position7,position8,position9};
                }



                void  ShuffleElements(){
                    try {
                        int len = newNum.length;
                        for (int i=0;i<len;i++){
                            int s = i+(int)(Math.random()*(len-i));
                            int temp = newNum[s];
                            newNum[s]=newNum[i];
                            newNum[i] = temp;
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }


                private void SetGoodJob(){
                switch (avatar) {
                    case 0:
                        goodJob = lorenzo;
                        break;
                    case 1:
                        goodJob = chanell;
                        break;
                    case 2:
                        goodJob = sophia;
                        break;
                    case 3:
                        goodJob = brishon;
                        break;
                    case 4:
                        goodJob = harmony;
                        break;
                    case 5:
                        goodJob = jazel;
                        break;
                    case 6:
                        goodJob = mateo;
                        break;
                    case 7:
                        goodJob = getsi;
                        break;
                    case 8:
                        goodJob = sergio;
                        break;
                    case 9:
                        goodJob = dogo;
                        break;
                    case 10:
                        goodJob = darren;
                        break;
                    case 11:
                        goodJob = qasti;
                        break;
                    case 12:
                        goodJob = lanea;
                        break;
                    case 13:
                        goodJob = caleb;
                        break;
                    case 14:
                        goodJob = juan;
                        break;
                    case 15:
                        goodJob = mariana;
                        break;
                    case 16:
                        goodJob = willy;
                        break;
                    case 17:
                        goodJob = ember;
                        break;
                    case 18:
                        goodJob = peter;
                        break;
                    case 19:
                        goodJob = darrell;
                        spanish = true;
                        break;
                    case 20:
                        goodJob = chelsy;
                        spanish = true;
                        break;
                    case 21:
                        goodJob = daphne;
                        spanish = true;
                        break;
                    case 22:
                        goodJob = nobody;
                        break;
                    case 23:
                        goodJob = nobody;
                        break;
                }
            }

            @Override


            public void onClick(View v) {
                long interval = SystemClock.elapsedRealtime() - mLastClickTime;
                if ( interval< delay) return;
                mLastClickTime = SystemClock.elapsedRealtime();
                    final int id = v.getId();
                SetGoodJob();

                    switch (id) {
                        case R.id.nothingButton:
                            if (enterOnly)PressEnter();
                            else {
                            lastButton = iNothing;
                            lastButtonImage = mNothing;
                            Insert(num[0]);}
                            break;

                        case R.id.oneButton:
                            if (enterOnly)PressEnter();
                            else {
                            lastButton = iOne;
                            lastButtonImage = mOne;
                            Insert(num[1]);}
                            break;

                        case R.id.twoButton:
                            if (enterOnly)PressEnter();
                            else {
                            lastButton = iTwo;
                            lastButtonImage = mTwo;
                            Insert(num[2]);}
                            break;

                        case R.id.threeButton:
                            if (enterOnly)PressEnter();
                            else {
                            lastButton = iThree;
                            lastButtonImage = mThree;
                            Insert(num[3]);}
                            break;

                        case R.id.fourButton:
                            if (enterOnly)PressEnter();
                            else {
                            lastButton = iFour;
                            lastButtonImage = mFour;
                            Insert(num[4]);}
                            break;

                        case R.id.fiveButton:
                            if (enterOnly)PressEnter();
                            else {
                            lastButton = iFive;
                            lastButtonImage = mFive;
                            Insert(num[5]);}
                            break;

                        case R.id.sixButton:
                            if (enterOnly)PressEnter();
                            else {
                            lastButton = iSix;
                            lastButtonImage = mSix;
                            Insert(num[6]);}
                            break;

                        case R.id.sevenButton:
                            if (enterOnly)PressEnter();
                            else {
                            lastButton = iSeven;
                            lastButtonImage = mSeven;
                            Insert(num[7]);}
                            break;

                        case R.id.eightButton:
                            if (enterOnly)PressEnter();
                            else {
                            lastButton = iEight;
                            lastButtonImage = mEight;
                            Insert(num[8]);}
                            break;

                        case R.id.nineButton:
                            if (enterOnly)PressEnter();
                            else {
                            lastButton = iNine;            //i is an image view,
                            lastButtonImage = mNine;       //m is an image resourse
                            Insert(num[9]);}
                            break;


                        case R.id.leftButton:
                            if (enterOnly)PressEnter();
                            else {
                            leftView.clearAnimation();
                            rightView.clearAnimation();
                            StopPlaying();
                            switch (useButtons) {
                                case "Direction":
                                    DirectionPositive();
                                    break;
                                case "Parity":
                                    ParityEven();
                                    break;
                                case "Jump":
                                    JumpLeft();
                                    break;
                                case "Yes":
                                    yesAnswer = true;
                                    YesOrNo();
                                    break;
                                case "Avatars":
                                    ++avatarList;
                                    numberOfPages = 1+(avatarKeys.length) / 10;
                                    avatarList=avatarList%numberOfPages;
                                    declaredAvatar=false;
                                    currentChange=2;
                                    noQuestion=true;
                                    NextQuestion();
                                    break;
                            }
                            break;
                            }

                        case R.id.rightButton:
                            if (enterOnly)PressEnter();
                            else {
                            rightView.clearAnimation();
                            leftView.clearAnimation();
                            StopPlaying();
                            switch (useButtons) {
                                case "Direction":
                                    DirectionNegative();
                                    break;
                                case "Parity":
                                    ParityOdd();
                                    break;
                                case "Jump":
                                    JumpRight();
                                    break;
                                case "Yes":
                                    yesAnswer = false;
                                    YesOrNo();
                                    break;
                                case "Avatars":
                                    --avatarList;
                                    numberOfPages = 1+(avatarKeys.length) / 10;
                                    avatarList=avatarList%numberOfPages;
                                    declaredAvatar=false;
                                    currentChange=2;
                                    noQuestion=true;
                                    NextQuestion();
                                    break;
                            }
                                break;
                            }


                        case R.id.bottomLeftButton:
                            if (enterOnly)PressEnter();
                            else {
                            StopPlaying();
                                if (game.equals("HalfWar")){
                                    if (odd){declaredOdd=true;
                                    lastButton = iBottomLeft;
                                    }
                                    UnitDollar();}
                            else
                                    Tens();}
                            break;
                        case R.id.bottomRightButton:
                            if (enterOnly)PressEnter();
                            else {
                                UnitDollar();}
                            break;

                        case R.id.levelButton:
                            iLevel.clearAnimation();
                            StopPlaying();
                            DeclaredFalse();
                            declaredLevel = false;
                            levelQuestion = true;
                            avatarQuestion=true;
                            declaredAvatar =false;
                            noQuestion=true;
                            newNum=avatarNum;
                            avatarList=0;
                            contest=false;
                            NextQuestion();
                            break;

                        case R.id.deleteButton:
                            if (enterOnly)PressEnter();
                            else {
                            StopPlaying();
                            Delete();}

                            break;
                        case R.id.upButton:
                            StopPlaying();
                            noQuestion = true;
                            StoreMemory();
                            break;
                        case R.id.decimalButton:
                            if (enterOnly)PressEnter();
                            else if (mathWarAnswer)UnitDollar();
                            else {
                            StopPlaying();
                            noQuestion = true;
                            InsertDecimal();}
                            break;


                        case R.id.changeButton:
                            if (enterOnly)PressEnter();
                            else if (mathWarAnswer)UnitDollar();
                            else {
                                noQuestion = true;
                            ChangeSign();}
                            break;

                        case R.id.enterButton:
                            waitForEnter=false;
                            PressEnter();

                            break; }

            }

                private void Tens() {
                   newNum=num0;
                   dontChooseKeys=false;
                   ChooseKeys();
                   noQuestion=false;
                   NextQuestion();
                }





                private void PressEnter() {
                    videoV.setVisibility(View.INVISIBLE);
                    enterView.clearAnimation();
                    waitForUnit=false;
                    enterOnly=false;
                    noQuestion = true;
                    StopPlaying();
                    if (correctKey) CorrectHint();
                    else if (correctParity) CorrectHint();
                    else if (correctDirection) CorrectHint();
                    else if (correctUnit) CorrectHint();
                    else if (correctVarity) CorrectHint();
                    else {

                        NextQuestion();
                    }
            }

                private void PlayList(int lastWords){
                    playlist.add(lastWords);
                }

                private void CorrectHint() {
                    hint = true;
                    clearInput=true;

                    if (correctKey) {
                        FindCorrectKey();

                        MoveViewToView(from, enterView, 0, false, true,500);

                    } else if (correctParity) {
                        correctParity = false;
                        if (parityState == 0) from = leftView;
                        else from = rightView;
                        MoveViewToView(from, enterView, 0, false, true,500);
                    } else if (correctDirection) {
                        correctDirection = false;
                        if (CorrectDirection() == 0) from = leftView;
                        else if (CorrectDirection() == 1) from = rightView;
                        else {
                            correctInt = 0;
                            FindCorrectKey();
                        }
                        MoveViewToView(from, enterView, 0, false, true,500);

                    } else if (correctUnit) {
                        correctUnit = false;
                        MoveViewToView(iBottomRight, enterView, 0, false, true,500);
                    } else if (correctVarity) {
                        correctVarity = false;
                        if (plus_minus) from = leftView;
                        else from = rightView;
                        MoveViewToView(from, enterView, 0, false, true,500);
                        enterView.setImageResource(enterResource);
                    }
                }


                private void YesOrNo() {
                    if (yesAnswer) PlayList(R.raw.yes_no_sound);
                    else PlayList(R.raw.no);
                    declaredchangeOrDebit=true;
                    declaredSuccessRate=true;
                    declaredSumOrDifference = true;
                    noQuestion = true;
                    NextQuestion();
                }


                private void SignOfGreater() {

                    if (!declaredSignOfGreater) {
                        game="GeneralMath";
                        correctDirection = true;
                        PlayList(R.raw.direction_combination_greatest_magnitude);
                        PlayList(ShuffleArray(signOfGreaterQuestions));
                        UseTheDirection();
                        noQuestion = false;
                        clearInput = true;
                        NextQuestion();
                    } else {
                        if (CorrectDirection() == currentChange) {

                            PlayList(R.raw.direction_sound);
                            Play();
                            PlayList(ShuffleArray(goodJob));
                            signOfGreaterQuestion = false;
                            Score(1);
                            noQuestion = true;
                            DeclaredFalse();
                            NextQuestion();
                        } else {
                            correctDirection = true;
                            PressEnter();
                        }
                    }
            }
                private int InputValue(){
                    Clean();
                   try {
                       return (int) Double.parseDouble(old);
                   } catch (NumberFormatException e) {
                       return 0;
                   }
            }

            private void ContestantAvatar(){
                    if (!declaredContestantAvatar){
                        declaredContestantAvatar=true;
                        PlayList(R.raw.do_you_have_an_opponent);
                        UseYesNo();
                        contestantQuestion=true;
                        enterOnly=false;
                        noQuestion=false;
                        newNum=num0;
                        NextQuestion(); }
                    else {
                        if (yesAnswer){
                        contest=true;
                            avatarQuestion=true;
                            declaredAvatar =false;
                            noQuestion=true;
                            saveNum=newNum;
                            newNum=avatarNum;
                            avatarList=0;
                            contestantQuestion=false;
                            NextQuestion(); }
                        else{ contest=false;
                            contestantQuestion=false;
                        noQuestion=true;
                        NextQuestion();}

                        }
                }

                private int AbsInputValue() {
                    Clean();
                    old = old.replace("-", "");
                    if (old.equals(" "))old=" 0";
                    return (int) Double.parseDouble(old);
                }


                private void Greater() {
                if (!declaredGreater) {
                        correctKey = true;
                        currentChange=2;
                        correctTerm = greater;
                        g = 0;
                        if (Math.random() > .5) {
                            correctTerm = smaller;
                            g = 1;
                        }
                        PlayList(magnitudeOfSmallerOrGreaterTerm[g]);
                        correctInt = correctTerm;
                        clearInput = true;
                        dontChooseKeys=false;
                        noQuestion = false;
                        NextQuestion();
                    } else {
                        if (AbsInputValue() == correctTerm) {
                            PlayList(R.raw.greater);
                            correctKey = false;
                            if (correctTerm==firstRanNumAbs)MoveViewToView(lastButton,iTerm2,500,false,true,500);
                            else MoveViewToView(lastButton,iTerm1,300,false,true,500);
                            PlayList(ShuffleArray(goodJob));
                            noQuestion = true;
                            greaterQuestion = false;
                            Score(1);
                            DeclaredFalse();
                            NextQuestionDelayed(0);
                        } else {PressEnter();
                        }
                }
            }

                private String AbsInputString() {
                    Clean();
                    String s = old.replace("-", "");
                    if (clearInput) {
                        s = "";
                        clearInput = false;
                    }
                    return s;
                }
                
            
                private void StoreMemory() {
                    old = input.getText().toString();
                    memory.setText(old);
            }
            
            private void IncrementLevel() {
                    if (!declaredLevel) {
                        levelQuestion=true;
                        clearInput=true;
                        declaredLevel=true;
                        currentChange=0;
                        newNum = num0;
                        dontChooseKeys=false;
                        level=GetLevel();
                        input.setText(noCurrency.format(level));
                        PlayList(R.raw.you_are_at_level);
                        PlayList(numbers[level]);
                        noQuestion = false;
                        level=GetLevel();
                        delay=100;
                        game="Level";
                        enterView.startAnimation(enterB);
                        noQuestion=false;
                        NextQuestion();
                    } else {

                            level = AbsInputValue() - 1;
                            unitQuestion=false;
                            PassLevel();
                            levelQuestion=false;
                            DeclaredFalse();
                            dontChooseKeys=false;
                            ChooseKeys();
                            noQuestion=true;
                            enterOnly=false;
                            NextQuestion();
                    }
                }

                private void UnitDollar() {
                    StopPlaying();

                    String old2 = input.getText().toString();
                    old=DirectionString();
                    boolean test = old2.equalsIgnoreCase(old);
                    if (test){PlayList(R.raw.what_is_the_magnitude_term);

                    noQuestion=false;
                    NextQuestion();}
                    else {
                        declaredUnit = true;
                    iBottomRight.clearAnimation();
                    waitForUnit=false;
                    declaredSumOrDifference = true;
                    declaredUnitOfDifference = true;
                    declaredMagnitudeOfCombination=true;
                    declaredLevel=true;
                    declaredUnit = true;
                    old = input.getText().toString();
                    old = old.replace("$", "");
                    old = "$" + old;
                    input.setText(old);
                    dontChooseKeys=false;
                    noQuestion = true;
                    NextQuestion();}
                }

                private void Unit() {
                    if (!declaredUnit) {
                        declaredUnit=true;
                        PlayList(ShuffleArray(unitIs));
                        PlayList(R.raw.what_is_unit);
                        noQuestion = false;
                        waitForUnit=false;
                        clearInput=true;
                        NextQuestion();
                    } else {
                       old = input.getText().toString();
                        if (old.contains("$")) {
                            PlayList(ShuffleArray(goodJob));
                            unitQuestion = false;
                            noQuestion = true;
                            Score(1);
                            DeclaredFalse();
                            NextQuestion();
                        } else {correctUnit = true;
                            PressEnter();}
                    }
            }

            private void HowManyTerms() {
                    if (!declaredHowMany) {
                        game="HowMany";
                        clearInput = true;
                        currentChange=2;
                        PlayList(ShuffleArray(termIs));
                        PlayList(ShuffleArray(howManyQuestions));
                        correctKey = true;
                        correctInt = terms;
                        noQuestion = false;
                        NextQuestion();
                    } else if (terms == AbsInputValue()) {
                        correctKey = false;
                        PlayList(R.raw.how_many_sound);
                        Play();
                        new Handler().postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                iTerm1.startAnimation(spinOutLeft);
                                iTerm2.startAnimation(spinOut);
                            }
                        }, 10);

                        PlayList(ShuffleArray(goodJob));

                        Score(1);
                        DeclaredFalse();
                        dontChooseKeys=false;
                        howManyQuestion = false;
                        NextQuestionDelayed(800);}
                    else {
                        PressEnter();
                    }
                }
                
                private void FindCorrectKey() {

                    int i = correctInt;
                    if (i == num[0]) from = iNothing;
                    else if (i == num[1]) from = iOne;
                    else if (i == num[2]) from = iTwo;
                    else if (i == num[3]) from = iThree;
                    else if (i == num[4]) from = iFour;
                    else if (i == num[5]) from = iFive;
                    else if (i == num[6]) from = iSix;
                    else if (i == num[7]) from = iSeven;
                    else if (i == num[8]) from = iEight;
                    else if (i == num[9]) from = iNine;
            }

            private void NextQuestion() {
                    if (waitForEnter){}
                    else if (videoTime)VideoPlay();
                    else if (!noQuestion){ Play();
                    ChooseKeys();}
                    else if (passLevelQuestion)PassLevel();
                    else if (avatarQuestion) Avatar();
                    else if (levelQuestion) IncrementLevel();
                    else if (merchandiseQuestion) PickMerchandise();
                    else if (paymentQuestion) PickPayment();
                    else if (changeOrDebitQuestion)ChangeOrDebit();
                    else if (howManyQuestion) HowManyTerms();
                    else if (directionQuestion) Direction();
                    else if (magnitudeQuestion) Magnitude();
                    else if (parityQuestion) Parity();
                    else if (halfQuestion) Half();
                    else if (greaterQuestion) Greater();
                    else if (signOfGreaterQuestion) SignOfGreater();
                    else if (unitQuestion) Unit();
                    else if (sumOrDifferenceQuestion) SumOrDifference();
                    else if (signOfCombinationQuestion) SignOfTheCombination();
                    else if (magnitudeOfCombinationQuestion) MagnitudeOfTheCombination();
                    else if (unitOfDifferenceQuestion) UnitOfTheDifference();
                    else if (contestantQuestion) ContestantAvatar();
                    else if (mathWarQuestion)MathWar();
                    else if (halfWarAnswer) HalfWarAnswer();
                    else if (mathWarAnswer) MathWarAnswer();
                    else if (algebraQuestion) Algebra();
                    else if (algebraAnswer) AlgebraAnswer();
                    else if (successRateQuestion)SuccessRate();

                    else CreateQuestion();
                }



                private void UseOdd() {
                    iBottomLeft.setImageResource(R.drawable.odd_button);
                    iBottomLeft.startAnimation(enterB);
                }


                private void Algebra() {
                    if (!declaredContestantAvatar){
                        ContestantAvatar();}
                        else{
                            game=saveGame;
                            if (!algebraDeclared){
                        UseTheDirection();
                        if (contest){
                            PlayList(R.raw.this_turn_is_for_);
                            if (!opponent){PlayList(yourAvatar[avatar]);
                                leftView.setImageResource(avatarKeys[avatar]);
                            iLevel.bringToFront();}
                            else {PlayList(yourAvatar[avatar2]);
                                iLevel.setImageResource(avatarKeys[avatar2]);
                                iLevel.bringToFront();}
                        }
                        PlayList(R.raw.how_many);
                        if (game.equals("MinusHigh"))PlayList(minusAnswers[onlyAnswer]);
                        else PlayList(answers[onlyAnswer]);
                        PlayList(R.raw.can_you_make);
                        PlayList(R.raw.if_you_already_know_how);
                        PlayList(R.raw.it_is_not_necessary);
                        PlayList(R.raw.to_delete_use_dirrection);
                        algebraDeclared =true;
                        correctMathWarAnswers=0;
                        iPlus.setImageResource(R.drawable.no_sign);
                        iArg1.setImageResource(termSymbols[onlyAnswer]);
                        if (game.equals("MinusHigh"))iEquals.setImageResource(R.drawable.equals_minus);
                        else iEquals.setImageResource(R.drawable.equal);
                        iTerm2.setImageResource(R.drawable.no_sign);
                        if (direction1==-1)iMinus.setImageResource(R.drawable.minus);
                        else iMinus.setImageResource(R.drawable.no_sign);
                        iTerm1.setImageResource(termSymbols[firstRanNumAbs]);
                        wrongAnswerMathWar=0;
                        algebraQuestion =false;
                        waitForUnit=true;
                        algebraInt =RandomGen(0, laserSounds.length);
                        newNum=GetFillPosition(Math.max(absCorrect,3));
                        dontChooseKeys=false;
                        noQuestion=false;
                        NextQuestion();
                        }

                    else {
                        if (!warHasStarted){mathWarStartTime = SystemClock.elapsedRealtime();
                            warHasStarted=true;}
                        elapsedTime = SystemClock.elapsedRealtime() - mathWarStartTime;
                        tDebit.setText(noCurrency.format(wrongAnswerMathWar));
                        if ( elapsedTime< 20000){

                            GenerateArguments();
                            delay=100;
                            if (direction1==-1)iMinus.setImageResource(R.drawable.minus);
                            else iMinus.setImageResource(R.drawable.no_sign);
                            iTerm1.setImageResource(termSymbols[firstRanNumAbs]);
                            iTerm1.startAnimation(rotateA);
                            iArg1.setImageResource(termSymbols[onlyAnswer]);
                            if (game.equals("MinusHigh"))iEquals.setImageResource(R.drawable.equals_minus);
                            else iEquals.setImageResource(R.drawable.equal);
                            iTerm2.setImageResource(R.drawable.no_sign);
                            iPlus.setImageResource(R.drawable.no_sign);
                            waitForUnit=true;
                            clearInput=true;
                            declaredAlgebraAnswer =false;
                            algebraQuestion =false;
                            UseTheDirection();
                            newNum=GetFillPosition(Math.max(absCorrect,3));
                            dontChooseKeys=false;
                            noQuestion=false;
                            NextQuestion();}
                        else {
                            DeclaredFalse();

                            algebraQuestion = true;
                            algebraDeclared = false;
                            merchandiseValue = correctMathWarAnswers;
                            tDebit.setText(noCurrency.format(wrongAnswerMathWar));
                            CalculateSuccessRate();
                        }}
                    }
            }

            private void CalculateSuccessRate() {
                delay=3000;
                if (opponent){
                        ++opponentSuccessFactor;
                        opponentMerchandiseTotal=opponentMerchandiseTotal+merchandiseValue;
                         opponentSuccessRate=opponentMerchandiseTotal/opponentSuccessFactor*3;
                         rateNumber = opponentSuccessRate;
                    tOpponentRate.setText(noCurrency.format(opponentMerchandiseTotal));
                    tOpponentRate.clearAnimation();
                    tMerchandise.startAnimation(anim1);
                    }
                    else {
                        Score(1);
                        ++successFactor;
                        successRate=merchandiseTotal/successFactor*3;
                        rateNumber = successRate;
                        tOpponentRate.startAnimation(anim1);
                        tMerchandise.clearAnimation();}
                    PlayList(R.raw.number_of_errors);
                    PlayList(numbers[wrongAnswerMathWar]);
                    if (halfWarQuestion)PlayList(R.raw.the_number_of_halves_you_correctly_solved);
                    else if (algebraQuestion)PlayList(R.raw.the_number_of_algebra_problems_you_correctly_solved);
                    else PlayList(R.raw.number_solved_was);
                    PlayList(numbers[correctMathWarAnswers]);
                    PlayList(R.raw.the_number_you_correctly_solved);
                    PlayList(numbers[rateNumber]);
                    memory.setText(getResources().getString(R.string.successRates,avatarsName[avatar],successRate,avatarsName[avatar2],opponentSuccessRate));
                    noQuestion=true;
                    if (contest){
                        opponent= !opponent;
                    }
                    if (lastGrade==5){successRateQuestion=true;
                        declaredSuccessRate=false;
                        SuccessRate();}
                    else

                        NextQuestion();
            }
                        
            private void MathWarAnswer() {
                if(InputValue()==correctAnswer) {
                    PlayList(laserSounds[algebraInt]);
                    MoveViewToView(lastButton, iArg1, 0, false, false, 500);
                    ++correctMathWarAnswers;
                    tWallet.setText(noCurrency.format(correctMathWarAnswers));
                    new Handler().postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    iTerm1.setImageResource(R.drawable.no_sign);
                                    iTerm2.setImageResource(R.drawable.no_sign);
                                    iPlus.setImageResource(R.drawable.no_sign);
                                    iMinus.setImageResource(R.drawable.no_sign);
                                }
                            }, 1000);
                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            if (direction2==-1)iMinus.setImageResource(R.drawable.minus);
                            else iMinus.setImageResource(R.drawable.no_sign);
                            iTerm1.setImageResource(termSymbols[secondRanNumAbs]);
                            if (direction1==-1)iPlus.setImageResource(R.drawable.minus);
                            else iPlus.setImageResource(R.drawable.plus);
                            iTerm2.setImageResource(termSymbols[firstRanNumAbs]);
                        }
                    }, 4000);
                    mathWarQuestion=true;
                    dontChooseKeys=false;
                    noQuestion=true;
                    NextQuestion();}
                else {
                    ++wrongAnswerMathWar;
                    PlayList(R.raw.missed);
                    if (!declaredOdd){MoveViewToView(iBottomLeft,iArg1,300,false,true,1000);}
                    mathWarQuestion=false;
                    dontChooseKeys=true;
                    if (direction2==-1)iMinus.setImageResource(R.drawable.minus);
                    else iMinus.setImageResource(R.drawable.no_sign);
                    iTerm1.setImageResource(termSymbols[secondRanNumAbs]);
                    if (direction1==-1)iPlus.setImageResource(R.drawable.minus);
                    else iPlus.setImageResource(R.drawable.plus);
                    iTerm2.setImageResource(termSymbols[firstRanNumAbs]);
                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            iTerm1.setImageResource(R.drawable.no_sign);
                            iTerm2.setImageResource(R.drawable.no_sign);
                            iPlus.setImageResource(R.drawable.no_sign);
                            iMinus.setImageResource(R.drawable.no_sign);
                        }
                    }, 1000);
                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            if (direction2==-1)iMinus.setImageResource(R.drawable.minus);
                            else iMinus.setImageResource(R.drawable.no_sign);
                            iTerm1.setImageResource(termSymbols[secondRanNumAbs]);
                            if (direction1==-1)iPlus.setImageResource(R.drawable.minus);
                            else iPlus.setImageResource(R.drawable.plus);
                            iTerm2.setImageResource(termSymbols[firstRanNumAbs]);
                        }
                    }, 4000);
                    noQuestion=false;
                    waitForUnit=true;
                    NextQuestion();
                }
            }

                private void HalfWarAnswer() {
                    if ((!odd)&InputValue()==correctAnswer) {
                        PlayList(R.raw.spin_in);
                            iTerm1.setImageResource(termSymbols[absCorrect]);
                            iTerm2.setImageResource(termSymbols[absCorrect]);
                            iTerm1.startAnimation(spinInLeft);
                            iTerm2.startAnimation(spinIn);
                        ++correctMathWarAnswers;
                        tWallet.setText(noCurrency.format(correctMathWarAnswers));
                        new Handler().postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                iTerm1.setImageResource(R.drawable.no_sign);
                                iTerm2.setImageResource(R.drawable.no_sign);
                                iPlus.setImageResource(R.drawable.no_sign);
                                iMinus.setImageResource(R.drawable.no_sign);
                            }
                        }, 1500);
                        mathWarQuestion=true;
                        dontChooseKeys=false;
                        noQuestion=true;
                        NextQuestion();
                    }
                    else if (odd & declaredOdd){
                        PlayList(laserSounds[algebraInt]);
                        MoveViewToView(lastButton, iArg1, 0, false, false, 200);
                    ++correctMathWarAnswers;
                        tWallet.setText(noCurrency.format(correctMathWarAnswers));
                        new Handler().postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                iTerm1.setImageResource(R.drawable.no_sign);
                                iTerm2.setImageResource(R.drawable.no_sign);
                                iPlus.setImageResource(R.drawable.no_sign);
                                iMinus.setImageResource(R.drawable.no_sign);
                            }
                        }, 1500);
                        mathWarQuestion=true;
                        dontChooseKeys=false;
                        noQuestion=true;
                        NextQuestion();
                    }
                    else {
                        ++wrongAnswerMathWar;
                        clearInput=true;
                        PlayList(R.raw.missed);
                        if (!declaredOdd){MoveViewToView(iBottomLeft,iArg1,300,false,true,1000);}
                        mathWarQuestion=false;
                        correctAnswer=firstRanNum/2;
                        odd= firstRanNum % 2 != 0;
                        dontChooseKeys=true;
                        noQuestion=false;
                        waitForUnit=true;
                        NextQuestion();
                    }
                }


                private void AlgebraAnswer() {
                    if (InputValue()==correctAnswer){

                        PlayList(laserSounds[algebraInt]);
                        Play();
                        MoveViewToView(lastButton,iTerm2,0,false,false,100);
                        ++correctMathWarAnswers;
                        tWallet.setText(noCurrency.format(correctMathWarAnswers));
                        algebraQuestion =true;
                        dontChooseKeys=true;
                        noQuestion=true;
                        NextQuestionDelayed(400);}
                    else {
                        ++wrongAnswerMathWar;clearInput=true;

                        PlayList(R.raw.missed);
                        algebraQuestion =false;
                        dontChooseKeys=true;
                        noQuestion=false;
                        waitForUnit=true;
                        NextQuestion();
                    }

                }

                private void MathWar() {

                    if (!declaredContestantAvatar)ContestantAvatar();
                    else{
                    if (!declaredMathWar) {
                    UseTheDirection();
                    if (game.equals("HalfWar"))UseOdd();
                    if (contest) {
                        PlayList(R.raw.this_turn_is_for_);
                        if (!opponent){PlayList(yourAvatar[avatar]);
                            iLevel.setImageResource(avatarKeys[avatar]);}
                        else {PlayList(yourAvatar[avatar2]);
                            iLevel.setImageResource(avatarKeys[avatar2]);}
                    }
                    game=saveGame;
                    if (game.equals("HalfWar"))PlayList(R.raw.to_play_half_war);
                        else PlayList(R.raw.to_play_math_war);
                        PlayList(ShuffleArray(mathWarHints));
                    if (game.equals("HalfWar"))PlayList(R.raw.how_many_halves);
                        else PlayList(R.raw.how_many_combinations_in20_seconds);
                        if (game.equals("MathWar")){
                            if (direction2==-1)iMinus.setImageResource(R.drawable.minus);
                            else iMinus.setImageResource(R.drawable.no_sign);
                            iTerm1.setImageResource(termSymbols[secondRanNumAbs]);
                            if (direction1==-1)iPlus.setImageResource(R.drawable.minus);
                            else iPlus.setImageResource(R.drawable.plus);
                            iTerm2.setImageResource(termSymbols[firstRanNumAbs]);}
                        else{
                            if (game.equals("HalfWar")){iArg1.setImageResource(termSymbols[firstRanNumAbs]);
                            if (direction1==-1)iEquals.setImageResource(R.drawable.equals_minus);
                            else iEquals.setImageResource(R.drawable.equal);}
                        }
                        declaredMathWar = true;
                        correctMathWarAnswers = 0;
                        wrongAnswerMathWar = 0;
                        mathWarQuestion = false;
                        waitForUnit = true;
                        dontChooseKeys = false;
                        enterOnly = false;
                    newNum=GetFillPosition(Math.max(absCorrect,3));
                        algebraInt =RandomGen(0, laserSounds.length);
                    dontChooseKeys=false;
                        noQuestion = false;
                        NextQuestion();

                }
                    else {
                        if (!warHasStarted){mathWarStartTime = SystemClock.elapsedRealtime();
                        warHasStarted=true;
                        }
                        elapsedTime = SystemClock.elapsedRealtime() - mathWarStartTime;
                        tDebit.setText(noCurrency.format(wrongAnswerMathWar));
                        if ( elapsedTime< 20000){
                            delay=100;
                        GenerateArguments();
                        if (game.equals("MathWar")){
                                if (direction2==-1)iMinus.setImageResource(R.drawable.minus);
                                else iMinus.setImageResource(R.drawable.no_sign);
                                iTerm1.setImageResource(termSymbols[secondRanNumAbs]);
                                if (direction1==-1)iPlus.setImageResource(R.drawable.minus);
                                else iPlus.setImageResource(R.drawable.plus);
                                iTerm2.setImageResource(termSymbols[firstRanNumAbs]);}
                        else{
                                if (game.equals("HalfWar")){iArg1.setImageResource(termSymbols[firstRanNumAbs]);
                                    if (direction1==-1)iEquals.setImageResource(R.drawable.equals_minus);
                                    else iEquals.setImageResource(R.drawable.equal);}
                        }
                        waitForUnit=true;
                        clearInput=true;
                        declaredMathWarAnswer=false;
                        mathWarQuestion=false;
                        UseTheDirection();
                            newNum=GetFillPosition(Math.max(absCorrect,3));
                            dontChooseKeys=false;
                        noQuestion=false;
                        NextQuestion();}
                        else {
                            DeclaredFalse();
                            delay=3000;
                            mathWarQuestion = true;
                            merchandiseValue = correctMathWarAnswers;
                            CalculateSuccessRate();}
                        }
                    }
                }

                @SuppressLint("StringFormatInvalid")
                private void SuccessRate() {
                if (!declaredSuccessRate){
                    PlayList(R.raw.your_previous_rate);
                    PlayList(numbers[GetSuccessRate()]);
                    PlayList(R.raw.store_this_new_success_rate);
                    UseYesNo();
                    mathWarQuestion=false;
                    algebraQuestion =false;
                    algebraAnswer =false;
                    mathWarAnswer=false;
                    noQuestion=false;
                    successRateQuestion=true;
                    NextQuestion();
                    }
                    else {
                        if (yesAnswer){StoreSuccessRate();
                        StoreSuccessRate2();
                        if (successRate>opponentSuccessRate)memory.setText(getResources().getString(R.string.beat,avatarsName[avatar],successRate));
                        else memory.setText(getResources().getString(R.string.beat,avatarsName[avatar2],successRate));
                        PassLevel();
                        }
                        successRateQuestion=false;
                        noQuestion=true;
                        NextQuestion();}
            }

            private void ChangeOrDebit() {
                    if (!declaredchangeOrDebit) {
                        declaredchangeOrDebit=true;
                        correctDirection = true;
                        tDebit.bringToFront();
                        tWallet.bringToFront();
                        correctDirection = true;
                        dontChooseKeys=true;
                        PlayList(ShuffleArray(directionExplained));
                        PlayList(ShuffleArray(cashOrDebitWords));
                        UseTheDirection();
                        noQuestion = false;
                        clearInput = true;
                        dontChooseKeys = false;
                        newNum=num0;
                        NextQuestion();
                    } else {
                        if (CorrectDirection() == currentChange) {
                            PlayList(ShuffleArray(goodJob));

                            if (CorrectDirection()==1)debit=true;
                            else change=true;
                            noQuestion = true;
                            DeclaredFalse();
                            clearInput=true;
                            changeOrDebitQuestion=false;
                            NextQuestion();
                        } else {
                            correctDirection = true;
                            PressEnter();
                        }
                    }
                }
                
                private void Avatar() {
                    if (!declaredAvatar) {
                        ClearAllQuestions();
                        game="Avatar";
                        UseTheDirection();
                        useButtons="Avatars";
                        if (contest)PlayList(R.raw.what_is_your_partners_avatar);
                        else PlayList(ShuffleArray(whatAvatar));
                        dontChooseKeys=false;
                        chooseAvatar=true;
                        clearInput=true;
                   //     waitForEnter=true;
                        absCorrectString="31";
                        enterOnly=false;
                        delay=200;
                        noQuestion=false;
                        NextQuestion();}
                    else  {
                        if (contest)avatar2 = AbsInputValue();
                        else avatar = AbsInputValue();
                        if (contest)PlayList(yourAvatar[avatar2]);
                        else PlayList(yourAvatar[avatar]);
                        iLevel.setImageResource(avatarKeys[avatar]);
                        StoreAvatar(avatar);
                        avatarQuestion = false;
                        SetGoodJob();
                        dontChooseKeys=false;
                        newNum=num0;
                        ChooseKeys();
                        clearInput=true;
                        delay=500;
                        declaredLevel=false;
                        noQuestion=true;
                        NextQuestion();
                    }
                }


                private void ChooseKeys() {
                    if (dontChooseKeys) {}
                    else {dontChooseKeys=true;
                        ShuffleElements();
                        num = newNum;

                        buttons = new int[]{ShuffleArray(zeroButtons), ShuffleArray(oneButtons), ShuffleArray(twoButtons), ShuffleArray(threeButtons), ShuffleArray(fourButtons), ShuffleArray(fiveButtons), ShuffleArray(sixButtons), ShuffleArray(sevenButtons), ShuffleArray(eightButtons), ShuffleArray(nineButtons), ShuffleArray(tenButtons), ShuffleArray(elevenButtons), ShuffleArray(twelveButtons), ShuffleArray(thirteenButtons), ShuffleArray(fourteenButtons), ShuffleArray(fifteenButtons), ShuffleArray(sixteenButtons), ShuffleArray(seventeenButtons), ShuffleArray(eighteenButtons)};
                        int[] merchandiseKeys= {ShuffleArray(zeroButtons), ShuffleArray(oneMerchandise), ShuffleArray(twoMerchandise), ShuffleArray(threeMerchandise), ShuffleArray(fourMerchandise), ShuffleArray(fiveMerchandise), ShuffleArray(sixMerchandise), ShuffleArray(sevenButtons), ShuffleArray(eightButtons), ShuffleArray(nineButtons)};
                        if (merchandiseQuestion){
                            num=merchandiseNum;
                            buttons=merchandiseKeys;}
                        if (chooseAvatar){buttons = avatarKeys;
                        switch (avatarList){
                            case 0:
                                num=avatarNum;
                            break;
                            case 1:
                                num=avatarNum1;
                            break;
                            case 2:
                                num=avatarNum2;
                                break;}
                        chooseAvatar=false;}
                        ScrambleButtons();
                    }
                }

                private void MagnitudeOfTheCombination() {
                    if (!declaredMagnitudeOfCombination) {
                        game=saveGame;
                        clearInput=false;
                        correctInt = absCorrect;
                        correctUnit=true;
                        if (change)PlayList(R.raw.how_much_change);
                        else if (debit)PlayList(R.raw.how_much_debt);
                        else PlayList(magnitudeQuestions[sameSignStatus]);
                        noQuestion = false;
                        equalsView = true;
                        waitForUnit=true;
                        correctKey = true;
                        correctInt = absCorrect;
                        newNum=GetFillPosition(Math.max(absCorrect,3));
                        dontChooseKeys=false;
                        NextQuestion();
                    } else {
                        if (game.equals("Merchandise") & correctAnswer+debitcard < 0) {
                            PlayList(R.raw.how_embarassing);
                            magnitudeOfCombinationQuestion=false;
                            debit=false;
                            change=false;
                            dontChooseKeys=true;
                            noQuestion=true;
                            NextQuestion();
                        }
                        else if (absCorrect == AbsInputValue()) {
                            iDollar.setImageResource(termSymbols[absCorrect]);
                            MoveViewToView(iDollar,iArg1,100,true,true,500);
                            PlayList(R.raw.magnitude_of_combination_sound);
                            Play();
                            correctKey = false;
                            PlayList(ShuffleArray(goodJob));
                            magnitudeOfCombinationQuestion = false;
                            if (game.equals("Merchandise")){debitcard=debitcard+correctAnswer;
                            tDebit.setText(currency.format(debitcard));}
                            Score(1);
                            DeclaredFalse();
                            dontChooseKeys=true;
                            noQuestion=true;
                            enterResource=R.drawable.enter;
                            NextQuestionDelayed(1200);}
                        else {correctUnit=false;
                        correctKey=true;
                        waitForUnit=true;
                            declaredMagnitudeOfCombination = false;
                            PressEnter();}
                    }
                }
                
                private void UnitOfTheDifference() {
                    if (!declaredUnitOfDifference) {
                        PlayList(R.raw.unit_of_combination);
                        correctUnit = true;
                        dontChooseKeys=false;
                        noQuestion = false;
                        NextQuestion();
                    } else {
                        old = input.getText().toString();
                        if (old.contains("$")) {
                            PlayList(ShuffleArray(goodJob));
                            unitOfDifferenceQuestion = false;
                            noQuestion = true;
                            Score(1);
                            DeclaredFalse();
                            NextQuestion();
                        } else {
                            PlayList(R.raw.unit_is_dollar);
                            Score(0);
                            declaredUnitOfDifference = false;
                            NextQuestion();
                        }
                    }
                }

                private void SignOfTheCombination() {
                    balance = firstRanNum + high + debitcard;
                    if (balance < 0) {
                        PlayList(R.raw.how_embarassing);
                        declaredMerchandise=false;
                        PickMerchandise();
                    }
                    else if (!declaredSignOfCombination) {
                        correctDirection = true;
                        game="GeneralMath";
                        PlayList(correctSignOfCombination[sameSignStatus]);
                        PlayList(signOfSumOrDifference[sameSignStatus]);
                        UseTheDirection();
                        noQuestion = false;
                        clearInput = true;dontChooseKeys=false;
                        ChooseKeys();
                        dontChooseKeys = true;
                        delay=100;
                        NextQuestion();
                    } else {
                        if (CorrectDirection() == currentChange) {

                            PlayList(R.raw.direction_sound);
                            PlayList(ShuffleArray(goodJob));
                            signOfCombinationQuestion = false;

                            noQuestion = true;
                            DeclaredFalse();
                            clearInput=true;
                            delay=100;
                            NextQuestion();
                        } else {correctDirection=true;
                            PressEnter();}
                    }
                }

               


                private void UseYesNo() {
                    useButtons = "Yes";
                    noQuestion = false;
                    leftView.setImageResource(R.drawable.yes);
                    rightView.setImageResource(R.drawable.no_button);
                }

                private void SumOrDifference() {
                    if (!declaredSumOrDifference) {
                        correctVarity = true;
                        PlayList(R.raw.same_produce_sum);
                        PlayList(R.raw.opposite_produce_difference);
                        PlayList(R.raw.nothing_produces_identity);
                        PlayList(sumOrDifference[sameSignStatus]);
                        UseYesNo();
                        plus_minus=correctVarity;
                        dontChooseKeys=false;
                        noQuestion = false;
                        NextQuestion();
                    } else {
                        if (yesAnswer) {
                            PlayList(ShuffleArray(goodJob));
                            sumOrDifferenceQuestion = false;
                            noQuestion = true;
                            Score(1);
                            DeclaredFalse();
                            NextQuestion();
                        } else {correctVarity=true;
                            PressEnter();}
                    }
                }

                private void VideoPlay(){
                    videoV.setVisibility(View.VISIBLE);
                    videoTime=false;
                    int movie = videoRewards[level%videoRewards.length];
                    videoPath="android.resource://"+getPackageName()+"/"+movie;
                    Uri uri=Uri.parse(videoPath);
                    videoV.setVideoURI(uri);
                    waitForEnter=true;
                    videoV.start();
                    enterView.startAnimation(enterB);




                }

                private void Play() {
                    if (mp != null) {
                        mp.stop();
                        mp.release();
                        mp = null;
                        timer.cancel();}
                    if (!playlist.isEmpty()) {
                        words = playlist.get(0);
                        mp = MediaPlayer.create(MainActivity.this, words);
                        mp.start();
                        playlist.remove(0);
                        timer = new Timer();
                        if (playlist.size() > 0) playNext();
                    }

                }
                private void playNext() {
                    timer.schedule(new TimerTask() {
                        @Override
                        public void run() {
                            mp.reset();

                            mp = MediaPlayer.create(MainActivity.this, playlist.get(0));

                            mp.start();
                            playlist.remove(0);
                            if (playlist.size() > 0) {
                                playNext();
                            }

                        }


                    }, mp.getDuration() + 100);


                }
                private void StopPlaying() {
                    playlist.clear();
                    if (mp != null) {
                        mp.stop();
                        mp.release();
                        mp = null;
                        timer.cancel();
                    }
                }

                private void ParityOdd() {
                    PlayList(R.raw.odd);
                    lastButton = rightView;
                    declaredParity = true;
                    parity = 1;
                    noQuestion = true;
                    NextQuestion();
            }

                private void ParityEven() {
                    PlayList(R.raw.even);
                    lastButton = leftView;
                    declaredParity = true;
                    parity = 0;
                    noQuestion = true;
                    NextQuestion();
            }

                private void DirectionNegative() {
                    currentChange = 0;
                    if (game.equals("MathWar"))iEquals.setImageResource(R.drawable.equals_minus);
                    else iPlus.setImageResource(R.drawable.minus);
                    if (game.equals("Merchandise"))iEquals.setImageResource(R.drawable.equals_minus);
                    if (game.equals("HalfWar")){iMinus.setImageResource(R.drawable.minus);
                    iPlus.setImageResource(R.drawable.minus);}
                        signView = rightView;
                    ChangeSign();
            }

                private void DirectionPositive() {
                    currentChange = 2;
                    if (game.equals("MathWar"))iEquals.setImageResource(R.drawable.equal);
                    if (game.equals("Zero"))iPlus.setImageResource(R.drawable.plus);
                    if (game.equals("Low"))iPlus.setImageResource(R.drawable.plus);
                    if (game.equals("MinusHigh"))iPlus.setImageResource(R.drawable.plus);
                    if (game.equals("Merchandise"))iEquals.setImageResource(R.drawable.equal);
                    if (game.equals("HalfWar"))iPlus.setImageResource(R.drawable.plus);
                    signView = leftView;
                    ChangeSign();
                }


                private void Delete() {
                    delay=100;
                    old = input.getText().toString();
                    int i = old.indexOf(" ");
                    if (i > 0) {
                        String oldSegment = old.substring(i - 1, i )+" ";
                        String newString = old.replace(oldSegment, " ");
                        input.setText(newString);
                    }
            }

                private void Half() {
                    if (!declaredHalf) {
                        correctKey = true;
                        correctInt = absCorrect / 2;
                        PlayList(halfQuestions[absCorrect / 2]);
                        clearInput = true;
                        dontChooseKeys=false;
                        noQuestion = false;
                        NextQuestion();
                    } else {
                        if (absCorrect / 2 == AbsInputValue()) {
                            PlayList(R.raw.half_sound);
                            noQuestion = true;
                            PlayList(ShuffleArray(goodJob));
                            noQuestion = true;
                            halfQuestion = false;
                            correctKey = false;
                            Score(1);
                            DeclaredFalse();
                            clearInput = true;
                            dontChooseKeys=false;
                            NextQuestion();
                        } else { PressEnter();
                        }
                    }
            }

                private void TryTheScissors() {
                    PlayList(R.raw.try_the_scissors);
                    noQuestion = false;
                    NextQuestion();
                }


                private String DirectionString() {
                    String ds;
                    if (currentChange == 0) ds = "+ ";
                    else if (currentChange == 1) ds = "- ";
                    else ds = " ";
                    return ds;
                }

                private void ChangeSign() {
                    StopPlaying();
                    dontChooseKeys=true;
                    noMagnitude=true;
                    correctDirection =false;
                    currentChange++;
                    clearInput=true;
                    currentChange = currentChange % 3;
                    sign.setImageResource(signs[currentChange]);
                    if (!waitForUnit)PlayList(directionIs[currentChange]);
                    declaredDirection = true;
                    declaredSignOfGreater = true;
                    declaredSignOfCombination = true;
                    declaredchangeOrDebit=true;
                    String newOld = DirectionString() + AbsInputString();
                    input.setText(newOld);
                    if (waitForUnit){noQuestion=false;
                    NextQuestion();}
                    else {
                        noQuestion = true;

                        NextQuestion();
                    }
                }


                private void Direction() {
                    if (!declaredDirection) {
                        clearInput=true;
                        correctDirection = true;
                        PlayList(ShuffleArray(directionQuality));
                        PlayList(ShuffleArray(directionQuestions));
                        UseTheDirection();
                        noQuestion=false;
                        NextQuestion();

                    } else {
                        if (CorrectDirection() == currentChange) {
                            PlayList(R.raw.direction_sound);
                            Play();
                            PlayList(ShuffleArray(goodJob));
                            directionQuestion = false;
                            Score(1);
                            noQuestion = true;
                            DeclaredFalse();
                            NextQuestionDelayed(900);
                        } else {
                            correctDirection = true;
                            PressEnter();
                          }
                    }
                }

                private void DeclaredFalse() {


                    declaredHalfWarAnswer = false;
                    declaredHalfWar = false;
                    declaredAlgebraicDifference=false;
                    warHasStarted=false;
                    waitForUnit=false;
                    declaredMathWarAnswer = false;
                    declaredMathWar = false;
                    declaredchangeOrDebit = false;
                    declaredAvatar = false;
                    correctVarity = false;
                    correctUnit = false;
                    correctKey = false;
                    correctDirection = false;
                    declaredSignOfGreater = false;
                    declaredHowMany = false;
                    declaredSumOrDifference = false;
                    declaredCombine = false;
                    declaredUnit = false;
                    declaredDirection = false;
                    declaredMagnitude = false;
                    declaredHalf = false;
                    declaredGreater = false;
                    declaredParity = false;
                    declaredLevel = false;
                    declaredUnitOfDifference = false;
                    declaredSignOfCombination = false;
                    declaredMagnitudeOfCombination = false;
                    noQuestion = true;
                    declaredPayment=false;
                }


                private void UseTheDirection() {
                    sign.setImageResource(signs[currentChange]);
                    useButtons = "Direction";
                    leftView.setImageResource(R.drawable.plus_button);
                    rightView.setImageResource(R.drawable.minus_button);
                    if (game.equals("Merchandise")) {
                        rightView.setImageResource(R.drawable.debitcard);
                        leftView.setImageResource(R.drawable.wallet);
                        tWallet.setText(currency.format(high));
                    }
                }

                private void Magnitude() {
                    if (!declaredMagnitude) {
                        game="Magnitude";
                        clearInput = true;
                        PlayList(ShuffleArray(magnitudeIs));
                        PlayList(R.raw.what_is_the_magnitude_term);
                        correctKey = true;
                        correctInt = absCorrect;
                        currentChange=2;
                        dontChooseKeys=false;
                        noQuestion = false;
                        enterOnly=false;
                        NextQuestion();}
                    else if (absCorrect == AbsInputValue()) {
                            correctKey = false;
                            PlayList(R.raw.magnitude);
                            Play();
                            MoveViewToView(lastButton,iTerm2,0,false,true,500);
                            PlayList(ShuffleArray(goodJob));
                            noQuestion = true;
                            magnitudeQuestion = false;
                            Score(1);
                            DeclaredFalse();
                            NextQuestionDelayed(700);}
                    else {PressEnter();}
            }

            private void NextQuestionDelayed(long d) {
                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            NextQuestion();
                        }
                    }, d);
            }

                private void Parity() {
                    if (!declaredParity) {
                        PlayList(ShuffleArray(parityIs));
                        PlayList(ShuffleArray(parityQuestions));
                        UseTheParity();
                        correctParity = true;
                        leftView.startAnimation(anim1);
                        noQuestion = false;
                        NextQuestion();
                    } else if (parity == parityState) {
                        PlayList(R.raw.parity);
                        Play();
                        MoveViewToView(lastButton,iTerm2,500,false,true,500);
                        PlayList(ShuffleArray(goodJob));
                        Score(1);
                        DeclaredFalse();
                        parityQuestion = false;
                        NextQuestionDelayed(500);
                    } else {PressEnter();
                    }
            }

                private void UseTheParity() {
                    useButtons = "Parity";
                    leftView.setImageResource(R.drawable.two_is_even);
                    rightView.setImageResource(R.drawable.one_is_odd);


                }

                private void Score(int i) {

                    if (hint) hint = false;
                    else {


                        image_10 = image_9;
                        image_9 = image_8;
                        image_8 = image_7;
                        image_7 = image_6;
                        image_6 = image_5;
                        image_5 = image_4;
                        image_4 = image_3;
                        image_3 = image_2;
                        image_2 = image_1;

                        image_1 = merchandiseImage;
                        merchandise1=merchandiseValue;
                        if (i == 0){ image_1 = R.drawable.no_button;
                        merchandise1 = 0;}
                        merchandiseTotal=merchandise1+merchandise2+merchandise3+merchandise4+merchandise5+merchandise6+merchandise7+merchandise8+merchandise9+merchandise10;
                        tMerchandise.setText(currency.format(merchandiseTotal));

                        score_10 = score_9;
                        score_9 = score_8;
                        score_8 = score_7;
                        score_7 = score_6;
                        score_6 = score_5;
                        score_5 = score_4;
                        score_4 = score_3;
                        score_3 = score_2;
                        score_2 = score_1;
                        score_1 = i;

                        merchandise10=merchandise9;
                        merchandise9=merchandise8;
                        merchandise8=merchandise7;
                        merchandise7=merchandise6;
                        merchandise6=merchandise5;
                        merchandise5=merchandise4;
                        merchandise4=merchandise3;
                        merchandise3=merchandise2;
                        merchandise2=merchandise1;
                        enterView.setImageResource(merchandiseImage);

                        MoveViewToView(enterView, score1, 500, false, true,300);

                        if (moveTotal)tMerchandise.startAnimation(rotateA);

                        score1.setImageResource(image_1);
                        score2.setImageResource(image_2);
                        score3.setImageResource(image_3);
                        score4.setImageResource(image_4);
                        score5.setImageResource(image_5);
                        score6.setImageResource(image_6);
                        score7.setImageResource(image_7);
                        score8.setImageResource(image_8);
                        score9.setImageResource(image_9);
                        score10.setImageResource(image_10);
                        int grade =(score_1 + score_2 + score_3 + score_4 + score_5 + score_6 + score_7 + score_8 + score_9 + score_10)/2;
                        if (grade + lastGrade == 9) {
                            levelQuestion = false;
                            noQuestion = false;
                            delay=2000;
                            videoTime=true;
                            PassLevel();
                            noQuestion=false;
                            NextQuestion();


                        } else {

                            lastGrade = grade;
                            therm.setImageResource(thermGrade[grade]);

                        }
                    }
                }


                private void MoveViewToView(final View view, final View toView, long delayMove, boolean fill, boolean bounce,long duration) {
                /* DisplayMetrics dm= new DisplayMetrics();
                getWindowManager().getDefaultDisplay().getMetrics(dm);
                int origionalPos[]=new int[2];
                view.getLocationOnScreen(origionalPos);
                int xDelta=(dm.widthPixels-view.getMeasuredWidth()-origionalPos[0])/2;
                int yDelta=(dm.heightPixels-view.getMeasuredHeight()-origionalPos[1])/2;*/

                    AnimationSet animSet = new AnimationSet(bounce);
                    animSet.setFillAfter(fill);
                    animSet.setDuration(duration);
                    animSet.setInterpolator(new BounceInterpolator());
                    float scaleFactor = ((float) toView.getWidth() / view.getWidth());
                    float inverseScale = 1 / scaleFactor;
                    TranslateAnimation translate = new TranslateAnimation(0, (toView.getX() - view.getX()) * inverseScale, 0, inverseScale * (toView.getY() -toView.getHeight()/2- view.getY()+view.getHeight()/2));
                    animSet.addAnimation(translate);

                    animSet.setRepeatMode(0);
                    animSet.setStartOffset(delayMove);

                    ScaleAnimation scale;

                    scale = new ScaleAnimation(1, scaleFactor, 1, scaleFactor, ScaleAnimation.RELATIVE_TO_SELF, 0f, ScaleAnimation.RELATIVE_TO_SELF, 0f);
                    animSet.addAnimation(scale);
                    view.startAnimation(animSet);
                    view.bringToFront();
                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            if (!dontChooseKeys)ChooseKeys();
                            enterView.setImageResource(enterResource);
                        }
                    }, animSet.getDuration());

                }


                private void
                PassLevel() {
                    declaredContestantAvatar=false;
                    level = level + 1;
                    vLevel.setText(String.valueOf(level));
                    StoreLevel(level);
                    score_10 = 0;
                    image_10 = R.drawable.no_sign;
                    score_9 = 0;
                    image_9 = R.drawable.no_sign;
                    score_8 = 0;
                    image_8 = R.drawable.no_sign;
                    score_7 = 0;
                    image_7 = R.drawable.no_sign;
                    score_6 = 0;
                    image_6 = R.drawable.no_sign;
                    score_5 = 0;
                    image_5 = R.drawable.no_sign;
                    score_4 = 0;
                    image_4 = R.drawable.no_sign;
                    score_3 = 0;
                    image_3 = R.drawable.no_sign;
                    score_2 = 0;
                    image_2 = R.drawable.no_sign;
                    score_1 = 0;
                    image_1 = R.drawable.no_sign;

                    merchandise1=0;
                    merchandise2=0;
                    merchandise3=0;
                    merchandise4=0;
                    merchandise5=0;
                    merchandise6=0;
                    merchandise7=0;
                    merchandise8=0;
                    merchandise9=0;
                    merchandise10=0;
                    merchandiseTotal=0;
                    tMerchandise.setText("");

                    lastGrade = 0;
                    PlayList(R.raw.congratulations_you_made_the_next_level);
                    PlayList(numbers[level]);
                    PlayList(ShuffleArray(applause));
                    ClearAllQuestions();
                }

                private void Clean() {
                    old = input.getText().toString();
                    old = old.replace("$", "");
                    old = old.replace(" ", "");
                    old = old.replace("+", "");
                }


                private void CreateQuestion() {

                    CheckLevel();
                    if (merchandiseQuestion)PickMerchandise();
                    else {
                        GenerateArguments();
                        CreateInput();
                        CalculateCorrect();
                        delay=200;


                    }
                }

                private void CalculateCorrect() {
                    absCorrectString = String.valueOf(correctAnswer);
                    absCorrectString = absCorrectString.replace("-", "");
                    parityState = absCorrect % 2;
                    if (parityState == 1) halfQuestion = false;
                    greater = Math.max(firstRanNumAbs,secondRanNumAbs);
                    smaller = Math.min(firstRanNumAbs,secondRanNumAbs);
                    DeclaredFalse();
                    greatest = greater;
                    if (sameSignStatus == 2) greatest = absCorrect;
                    noQuestion=true;
                    NextQuestion();
                }

                private void GenerateArguments() {
                    firstRanNumAbs = RandomGen(low, high);
                    secondRanNumAbs = RandomGen(low, high);
                    if (game.equals("Magnitude"))secondRanNumAbs=0;
                    direction1 = 1;
                    if (Math.random() > .5) direction1 = -1;
                    direction2 = 1;
                    if (Math.random() > .5) direction2 = -1;
                    firstRanNum = firstRanNumAbs * direction1;
                    secondRanNum = secondRanNumAbs * direction2;
                    sameSignStatus = (int) (Math.signum(firstRanNum * secondRanNum) + 1);
                    if ((sameSignStatus == 0) & ((firstRanNum + secondRanNum) == 0))
                        sameSignStatus = 3;
                    plus_minus = sameSignStatus == 2;
                    if (game.equals("Zero"))correctAnswer=firstRanNum * -1;
                    if (game.equals("MinusHigh"))correctAnswer= - firstRanNum - onlyAnswer;
                    if (game.equals("Low"))correctAnswer= - firstRanNum + onlyAnswer;
                    if (game.equals("Magnitude")) correctAnswer = firstRanNum;
                    if (game.equals("Merchandise")) correctAnswer = secondRanNumAbs - firstRanNumAbs;
                    if (game.equals("MathWar")) correctAnswer = firstRanNum + secondRanNum;
                    if (game.equals("GeneralMath")) correctAnswer = firstRanNum + secondRanNum;
                    if (game.equals("Avatar"))correctAnswer=99;
                    if (game.equals("HowMany"))correctAnswer=terms;
                    if (game.equals("HalfWar")){correctAnswer=firstRanNum/2;
                        odd = firstRanNum % 2 != 0; }
                    absCorrect = Math.abs(correctAnswer);
                    if (combinationType < 3) if (sameSignStatus != combinationType) GenerateArguments();
                    if (absCorrect> high) GenerateArguments();
                }


                private void PickPayment() {
                    if (!declaredPayment){
                        tWallet.setText(currency.format(high));
                        tDebit.setText(currency.format(debitcard));
                        tDebit.bringToFront();
                        tWallet.bringToFront();
                        PlayList(ShuffleArray(toPay));
                        PlayList(R.raw.if_change__put_in_bank);
                        noQuestion=false;
                        clearInput=true;
                        merchandiseQuestion=false;
                        newNum=GetFillPosition(high);
                        dontChooseKeys=false;
                        currentChange=0;
                        game="Merchandise";
                        input.setText("$ ");
                        NextQuestionDelayed(500);
                    }else {
                    paymentChoice = lastButtonImage;    //image resourse
                        iTerm1.setImageResource(termSymbols[AbsInputValue()]);
                        iTerm1.startAnimation(rotateA);
                    secondRanNumAbs=AbsInputValue();
                    secondRanNum=AbsInputValue();
                    correctAnswer=firstRanNum+secondRanNum;
                        absCorrect= Math.abs(correctAnswer);
                        sameSignStatus = (int) (Math.signum(firstRanNum * secondRanNum) + 1);
                        paymentQuestion=false;
                        ChangeOrDebit();
                    }
                }

                private void PickMerchandise() {
                    if (!declaredMerchandise){
                        declaredMerchandise=true;
                        enterView.setImageResource(R.drawable.enter);
                        iDollar.setImageResource(R.drawable.no_sign);
                        tWallet.setText(currency.format(high));
                        tDebit.setText(currency.format(debitcard));
                        tDebit.bringToFront();
                        tWallet.bringToFront();
                        enterResource=R.drawable.enter;
                        merchandiseQuestion=true;
                        PlayList(R.raw.you_have_in_your_wallet);
                        PlayList(dollars[high]);
                        PlayList(R.raw.you_have_in_the_bank);
                        PlayList(dollars[debitcard]);
                        PlayList(ShuffleArray(wantToBuy));
                        currentChange=1;
                        input.setText(" ");
                        arg1.setText("");
                        arg2.setText("");
                        merchandiseQuestion=true;
                        dontChooseKeys=false;
                        chooseAvatar=false;
                        noQuestion=false;
                        NextQuestion();
                    }else {
                        merchandiseImage = lastButtonImage;
                        enterResource=merchandiseImage;
                        merchandiseQuestion=false;
                        enterView.setImageResource(merchandiseImage);
                        merchandiseValue=AbsInputValue();
                        moveTotal=true;
                        iPlus.setImageResource(R.drawable.minus);
                        iTerm2.setImageResource(termSymbols[merchandiseValue]);
                        iTerm2.startAnimation(rotateA);
                        declaredPayment=false;
                        declaredMerchandise=true;
                        firstRanNumAbs=AbsInputValue();
                        firstRanNum=AbsInputValue()*-1;
                        MoveViewToView(lastButton, enterView, 0, false, true,500);
                        PickPayment();}

                }


                private int CorrectDirection() {
                    direction = 2;
                    if (correctAnswer > 0) direction = 0;
                    if (correctAnswer < 0) direction = 1;
                    return direction;
                }

                private void CreateInput() {
                    iDollar.setImageResource(R.drawable.no_sign);

                    switch (terms) {
                        case 0:


                            break;
                        case 1:
                            switch ((int) Math.signum(firstRanNum)) {
                                case 0:
                                    PlayList(R.raw.no_dollars);
                                    break;
                                case 1:
                                    PlayList(plusDollars[firstRanNumAbs]);
                                    break;
                                case -1:
                                    PlayList(minusDollars[firstRanNumAbs]);
                                    break;
                            }
                            if (firstRanNum < 0) {
                                iPlus.setImageResource(R.drawable.minus);
                                iTerm2.setImageResource(termSymbols[firstRanNumAbs]);
                                iTerm2.startAnimation(rotateA);
                                }
                            else{
                                iPlus.setImageResource(R.drawable.plus);
                                iTerm2.setImageResource(termSymbols[firstRanNumAbs]);
                                iTerm2.startAnimation(rotateA);}
                            iTerm1.setImageResource(R.drawable.no_sign);

                            iMinus.setImageResource(R.drawable.no_sign);
                            break;

                        case 2:
                            switch ((int) Math.signum(secondRanNum)) {
                                case 0:
                                    PlayList(R.raw.no_dollars);
                                    break;
                                case 1:
                                    PlayList(plusDollars[secondRanNumAbs]);
                                    break;
                                case -1:
                                    PlayList(minusDollars[secondRanNumAbs]);
                                    break;
                            }


                            switch ((int) Math.signum(firstRanNum)) {
                                case 0:
                                    PlayList(R.raw.plus_no_dollars);
                                    break;
                                case 1:
                                    PlayList(plusDollars[firstRanNumAbs]);
                                    break;
                                case -1:
                                    PlayList(minusDollars[firstRanNumAbs]);
                                    break;
                            }


                            if (firstRanNum < 0){ argument1= " -$" + firstRanNumAbs;
                                iPlus.setImageResource(R.drawable.minus);
                                iTerm2.setImageResource(termSymbols[firstRanNumAbs]);
                                iTerm2.startAnimation(rotateA);}
                            else {argument1=" +$" + firstRanNumAbs;
                                iTerm2.setImageResource(termSymbols[firstRanNumAbs]);
                                iTerm2.startAnimation(rotateA);
                                iPlus.setImageResource(R.drawable.plus); }
                            if (secondRanNum < 0){
                                iMinus.setImageResource(R.drawable.minus);
                                iTerm1.setImageResource(termSymbols[secondRanNumAbs]);
                                iTerm1.startAnimation(rotateA);}
                            else {
                                iMinus.setImageResource(R.drawable.plus);
                                iTerm1.setImageResource(termSymbols[secondRanNumAbs]);
                                iTerm1.startAnimation(rotateA);
                            }
                            break;


                        default:

                    }
                }

                private void CheckLevel() {
                    superLevel=(level-9)/6;
                    ClearAllQuestions();
                    level = GetLevel();
                    switch (level) {
                        case 1:
                            //How many terms
                            terms = 1;
                            if (Math.random() > .5) terms = 2;
                            low = 0;
                            high = 2;
                            howManyQuestion = true;
                            declaredHowMany = false;
                            newNum = num1;
                            game = "MathWar";
                            break;


                        case 2:
                            //What is the magnitude
                            low = 0;
                            high = 2;
                            newNum = num1;
                            game = "Magnitude";
                            terms = 1;
                            magnitudeQuestion = true;
                            declaredMagnitude = false;
                            unitQuestion=true;
                            declaredUnit=false;
                            break;


                        case 3:
                            //What is half, parity lesson
                            low = 0;
                            high = 2;
                            ParityGame();
                            newNum = num1;
                            break;


                        case 4:
                            //parity/direction
                            directionQuestion = true;
                            declaredDirection = false;
                            magnitudeQuestion = true;
                            declaredMagnitude = false;
                            unitQuestion=true;
                            declaredUnit=false;
                            low = 0;
                            high = 2;
                            terms = 1;
                            game = "Magnitude";
                            newNum = num1;
                            break;

                        case 5:
                            //which term is greater/sign of greater
                            low = 0;
                            high = 2;
                            terms = 2;
                            game="GeneralMath";
                            greaterQuestion = true;
                            declaredGreater = false;
                            signOfGreaterQuestion = true;
                            declaredSignOfGreater = false;
                            newNum = num1;
                            break;

                        case 6:
                            //what kind of combination/ sign of the combination
                            low = 0;
                            high = 2;
                            terms = 2;
                            game="GeneralMath";
                            sumOrDifferenceQuestion = true;
                            declaredSumOrDifference = false;
                            signOfCombinationQuestion = true;
                            declaredSignOfCombination = false;
                            newNum = num1;
                            break;


                        case 7:
                            //magnitude of identity
                            low = 0;
                            high = 2;
                            terms = 2;
                            game="GeneralMath";
                            signOfCombinationQuestion = true;
                            declaredSignOfCombination = false;
                            magnitudeOfCombinationQuestion = true;
                            declaredMagnitudeOfCombination = false;
                            combinationType = 1;
                            newNum = num1;
                            break;


                        case 8:
                            //value of the sum
                            low = 0;
                            high = 2;
                            terms = 2;
                            game="GeneralMath";
                            signOfCombinationQuestion = true;
                            declaredSignOfCombination = false;
                            magnitudeOfCombinationQuestion = true;
                            declaredMagnitudeOfCombination = false;
                            combinationType = 2;
                            newNum = num1;
                            break;



                        default:
                            switch ((level-9) % 6) {
                                case 0:
                                    //create zerol
                                    low=superLevel*2+2;
                                    high=low+1;
                                    game="Zero";
                                    GameAlgebra(0);
                                    break;
                                case 1:
                                    //buy merchandise
                                    GameMerchandise();
                                    break;
                                case 2:
                                    //HALF war 0-high
                                    high=superLevel *2 + 3;
                                    low = Math.max(high-9,0);
                                    newNum=GetFillPosition(high/2);
                                    GameHalfWar();
                                    break;
                                case 3:
                                    //create low
                                    high=superLevel *2 + 3;
                                    low=0;
                                    game="Low";
                                    GameAlgebra(high-1);
                                    break;
                                case 4:
                                    //create -high
                                    high=superLevel * 2 + 3;
                                    low=0;
                                    game="MinusHigh";
                                    GameAlgebra( high);
                                    break;
                                case 5:
                                    //math war 0-high
                                    high=superLevel * 2 + 3;
                                    low=0;
                                    GameMathWar();
                                    break;
                            }
                    }
                }

                private void GameHalfWar() {
                    low = 0;
                    high = superLevel*2+3;
                    wrongAnswerMathWar=0;
                        opponent=false;
                        halfWarQuestion=true;
                        terms=0;
                        game="HalfWar";
                    saveGame=game;
                        mathWarQuestion = true;
                        declaredMathWar = false;
                    halfWarAnswer = true;
                        declaredMathWarAnswer = false;
                        successRate=0;
                        opponentSuccessRate=0;
                        successFactor=0;
                        opponentSuccessFactor=0;
                        merchandiseTotal=0;
                        opponentMerchandiseTotal = 0;
                }

                private void GameAlgebra(int Answer) {
                    terms=0;
                    saveGame = game;
                    algebraQuestion = true;
                    algebraDeclared =false;
                    algebraAnswer = true;
                    declaredAlgebraAnswer = false;
                    onlyAnswer= Answer;
                    successRate=0;
                    opponentSuccessRate=0;
                    successFactor=0;
                    opponent=false;
                    opponentSuccessFactor=0;
                    merchandiseTotal=0;
                    opponentMerchandiseTotal = 0;

            }

                private void ParityGame() {
                    parityQuestion = true;
                    declaredParity = false;
                    halfQuestion = true;
                    declaredHalf = false;
                    terms = 1;
                    game = "Magnitude";
                }

                private void ClearAllQuestions() {
                    enterResource=R.drawable.enter;
                    enterView.setImageResource(enterResource);
                    passLevelQuestion = false;
                    halfWarQuestion = false;
                    algebraAnswer = false;
                    algebraQuestion = false;

                    contestantQuestion = false;
                    debit=false;
                    displaySum = false;
                    change=false;
                    playAgainstQuestion = false;
                    iDollar.setImageResource(R.drawable.no_sign);
                    iArg1.setImageResource(R.drawable.no_sign);
                    iArg2.setImageResource(R.drawable.no_sign);
                    iEquals.setImageResource(R.drawable.no_sign);
                    iEquals2.setImageResource(R.drawable.no_sign);
                    iPlus.setImageResource(R.drawable.no_sign);
                    iMinus.setImageResource(R.drawable.no_sign);
                    iTerm1.setImageResource(R.drawable.no_sign);
                    iTerm2.setImageResource(R.drawable.no_sign);
                    iPlus2.setImageResource(R.drawable.no_sign);
                    iMinus2.setImageResource(R.drawable.no_sign);
                    iTerm12.setImageResource(R.drawable.no_sign);
                    iTerm22.setImageResource(R.drawable.no_sign);

                    moveTotal=false;
                    mathWarQuestion=false;
                    mathWarAnswer=false;
                    merchandiseImage=R.drawable.yes;
                    changeOrDebitQuestion = false;
                    combinationType = 3;
                    howManyQuestion = false;
                    parityQuestion = false;
                    magnitudeQuestion = false;
                    directionQuestion = false;
                    halfQuestion = false;
                    greaterQuestion = false;
                    unitQuestion = false;
                    unitOfDifferenceQuestion = false;
                    signOfCombinationQuestion = false;
                    sumOrDifferenceQuestion = false;
                    magnitudeOfCombinationQuestion = false;
                    signOfGreaterQuestion = false;
                    combineQuestion = false;

                    correctParity = false;
                    correctKey = false;
                    correctDirection = false;
                    correctUnit = false;
                    merchandiseQuestion=false;
                    paymentQuestion=false;
                    hint=false;


                }

                private void GameMathWar() {
                    high = superLevel*2+3;
                    low = Math.max(high-9,0);
                    opponent=false;
                    game = "MathWar";
                    saveGame=game;
                    terms = 0;
                    mathWarQuestion = true;
                    declaredMathWar = false;
                    mathWarAnswer = true;
                    declaredMathWarAnswer = false;
                    successRate=0;
                    opponentSuccessRate=0;
                    successFactor=0;
                    opponentSuccessFactor=0;
                    merchandiseTotal=0;
                    opponentMerchandiseTotal = 0;
                    combinationType=3;
                }



                private void GameMerchandise() {
                    high = (superLevel*2)+3;
                    low=0;
                    newNum=merchandiseNum;
                    merchandiseQuestion = true;
                    declaredMerchandise=false;
                    paymentQuestion=true;
                    declaredPayment=false;
                    changeOrDebitQuestion=true;
                    declaredchangeOrDebit=false;
                    game = "Merchandise";
                    saveGame=game;
                    terms = 0;
                    magnitudeOfCombinationQuestion=true;
                    declaredMagnitudeOfCombination=false;
                }

                private void JumpRight() {

                    int len = old.length();
                    int i = old.indexOf(" ");
                    if (i < len - 1) {
                        String oldSegment = old.substring(i, i + 2);
                        String newSegment = old.substring(i + 1, i + 2) + " ";
                        String newString = old.replace(oldSegment, newSegment);
                        input.setText(newString);
                    }
                }

                private void JumpLeft() {
                    String old = input.getText().toString();
                    int i = old.indexOf(" ");
                    if (i > 1) {
                        String oldSegment = old.substring(i - 1, i + 1);
                        String newSegment = " " + old.substring(i - 1, i);
                        String newString = old.replace(oldSegment, newSegment);
                        input.setText(newString);
                    }
                }

                private void Insert(int i) {
                    StopPlaying();
                    noMagnitude=false;
                    declaredUnit=true;
                    declaredMerchandise=true;
                    declaredPayment=true;
                    declaredSignOfGreater = true;
                    declaredHowMany = true;
                    declaredDirection = true;
                    declaredMagnitude = true;
                    declaredHalf = true;
                    declaredGreater = true;
                    declaredLevel = true;
                    declaredSumOrDifference = true;
                    declaredMagnitudeOfCombination = true;
                    declaredSignOfCombination = true;
                    declaredAvatar = true;
                    noQuestion = true;
                    old = input.getText().toString();
                    hasDollars =old.contains("$");
                    hasMinus = old.contains("-");
                    if (clearInput) {
                        old = " ";
                        noMagnitude=true;
                        if (currentChange==1)old = "- ";
                        clearInput = false;}
                    String newString = old.replace(" ", i+" " );
                    input.setText(newString);

                    if (game.equals("Level")){
                        enterView.startAnimation(enterB);
                        noQuestion=false;
                        NextQuestion();}

                    else if (waitForUnit){
                        iBottomRight.startAnimation(enterB);
                        noQuestion=false;
                        NextQuestion();}
                    else if (game.equals("Avatar")) NextQuestion();
                    else
                        PlayInput();
                }

                private void PlayInput() {
                    old = input.getText().toString();
                    int magOld = AbsInputValue();
                    if (magOld == 0) {
                        currentChange = 2;
                        sign.setImageResource(signs[currentChange]);
                        input.setText("0 ");
                        declaredSignOfGreater=true;
                        declaredDirection=true;
                        iEquals.setImageResource(R.drawable.equal);
                    }
                    noQuestion = true;
                    if (!dontChooseKeys)MoveViewToView(lastButton, iDollar, 0, false, false,500);
                    if (AbsInputString().length() > absCorrectString.length()) TryTheScissors();
                    if (!hasDollars) {
                        if (currentChange==1) PlayList(minusNumbers[magOld]);
                        if (currentChange==0)  PlayList(plusNumbers[magOld]);
                        if (currentChange==2) PlayList(numbers[magOld]);
                        }
                    else {
                        if (currentChange==1) PlayList(minusDollars[magOld]);
                        else PlayList(plusDollars[magOld]);
                    }
                    Play();
                    NextQuestionDelayed(400);
                }

                private void InsertDecimal() {
                    if (noQuestion) PlayList(ShuffleArray(questionWords));
                    noQuestion = true;
                    String old = input.getText().toString();
                    String newString = old.replace(" ", ". ");
                    input.setText(newString);
                    NextQuestion();
                }


                private void ScrambleButtons() {
                    iNothing.setImageResource(buttons[num[0]]);
                    mNothing = buttons[num[0]];
                    iNothing.bringToFront();
                    iOne.setImageResource(buttons[num[1]]);
                    mOne = buttons[num[1]];
                    iOne.bringToFront();
                    iTwo.setImageResource(buttons[num[2]]);
                    mTwo = buttons[num[2]];
                    iTwo.bringToFront();
                    iThree.setImageResource(buttons[num[3]]);
                    mThree = buttons[num[3]];
                    iThree.bringToFront();
                    iFour.setImageResource(buttons[num[4]]);
                    mFour = buttons[num[4]];
                    iFour.bringToFront();
                    iFive.setImageResource(buttons[num[5]]);
                    mFive = buttons[num[5]];
                    iFive.bringToFront();
                    iSix.setImageResource(buttons[num[6]]);
                    mSix = buttons[num[6]];
                    iSix.bringToFront();
                    iSeven.setImageResource(buttons[num[7]]);
                    mSeven = buttons[num[7]];
                    iSeven.bringToFront();
                    iEight.setImageResource(buttons[num[8]]);
                    mEight = buttons[num[8]];
                    iEight.bringToFront();
                    iNine.setImageResource(buttons[num[9]]);
                    mNine = buttons[num[9]];
                    iNine.bringToFront();}


            };




            bzero.setOnClickListener(calculatorListener);
            bOne.setOnClickListener(calculatorListener);
            btwo.setOnClickListener(calculatorListener);
            bthree.setOnClickListener(calculatorListener);
            bfour.setOnClickListener(calculatorListener);
            bfive.setOnClickListener(calculatorListener);
            bsix.setOnClickListener(calculatorListener);
            bseven.setOnClickListener(calculatorListener);
            beight.setOnClickListener(calculatorListener);
            bnine.setOnClickListener(calculatorListener);
            bleft.setOnClickListener(calculatorListener);
            bright.setOnClickListener(calculatorListener);
            beven.setOnClickListener(calculatorListener);
            bodd.setOnClickListener(calculatorListener);
            blevel.setOnClickListener(calculatorListener);
            bdelete.setOnClickListener(calculatorListener);
            bup.setOnClickListener(calculatorListener);
            bdecimal.setOnClickListener(calculatorListener);
            bchange.setOnClickListener(calculatorListener);
            benter.setOnClickListener(calculatorListener);
        } catch (Exception e) {
            Toast.makeText(this,e.getMessage(),Toast.LENGTH_SHORT).show();
            noQuestion=false;
    }
    }
}
