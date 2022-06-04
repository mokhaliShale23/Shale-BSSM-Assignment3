package com.example.coding;
import javafx.animation.*;
import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.*;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import javafx.util.Duration;


public class HelloApplication extends Application {


    Rectangle moneybag = new Rectangle(45,70);
    String source1 = getClass().getResource("/money.png").toExternalForm();
    Image point1 = new Image(source1);

    Rectangle moneybag2 = new Rectangle(45,70);
    String source2 = getClass().getResource("/money.png").toExternalForm();
    Image point2 = new Image(source2);

    Rectangle moneybag3 = new Rectangle(45,70);
    String source3 = getClass().getResource("/money.png").toExternalForm();
    Image point3 = new Image(source3);

    Rectangle moneybag4 = new Rectangle(45,70);
    String source4 = getClass().getResource("/money.png").toExternalForm();
    Image point4 = new Image(source4);

    //Creating images clouds
    Rectangle cloud1 = new Rectangle(180,100);
    String source_1 = getClass().getResource("/d.png").toExternalForm();
    Image image1 = new Image(source_1);


    Rectangle cloud2 = new Rectangle(180,100);
    String source_2 = getClass().getResource("/d.png").toExternalForm();
    Image image2 = new Image(source_2);


    Rectangle cloud3= new Rectangle(480,230);
    String source_3 = getClass().getResource("/d.png").toExternalForm();
    Image image3 = new Image(source_3);

    Rectangle cloud4 = new Rectangle(480,230);
    String source_4 = getClass().getResource("/d.png").toExternalForm();
    Image image4 = new Image(source_4);

    Rectangle cloud5 = new Rectangle(180,100);
    String source_5 = getClass().getResource("/d.png").toExternalForm();
    Image image5 = new Image(source_5);
    HBox labels = new HBox();


    Label labelScore;
    Label instructions;


    Duration dur_1 = Duration.millis(5000);
    Duration dur_2 = Duration.millis(7000);
    Duration dur_3 = Duration.millis(8000);
    Duration dur_4 = Duration.millis(10000);
    Duration dur_5 = Duration.millis(12000);


    Duration dur1 = Duration.millis(15000);
    Duration dur2 = Duration.millis(17000);
    Duration dur3 = Duration.millis(12000);
    Duration dur4 = Duration.millis(20000);



    TranslateTransition point_1 = new TranslateTransition(dur1);
    TranslateTransition point_2 = new TranslateTransition(dur2);
    TranslateTransition point_3 = new TranslateTransition(dur3);
    TranslateTransition point_4 = new TranslateTransition(dur4);



    TranslateTransition translate1 = new TranslateTransition(dur_1);
    TranslateTransition translate2 = new TranslateTransition(dur_2);
    TranslateTransition translate3 = new TranslateTransition(dur_3);
    TranslateTransition translate4 = new TranslateTransition(dur_4);
    TranslateTransition translate5 = new TranslateTransition(dur_5);


    SequentialTransition seq1;
    SequentialTransition seq2;
    SequentialTransition seq3;
    SequentialTransition seq4;


    SequentialTransition seqT1;
    SequentialTransition seqT2;
    SequentialTransition seqT3;
    SequentialTransition seqT4;
    SequentialTransition seqT5;


    Rectangle plane = new Rectangle(180,100);
    String source = getClass().getResource("/plane.png").toExternalForm();
    Image image = new Image(source);
    ImageView imageView = new ImageView(image);




    //Creating score
    int score;
    @Override
    public void start(Stage stage) {


        Pane root = new Pane();

        //setting clouds images


        cloud1.setFill(new ImagePattern(image1));



        cloud5.setFill(new ImagePattern(image5));



        cloud2.setFill(new ImagePattern(image2));



        cloud3.setFill(new ImagePattern(image3));

        cloud4.setFill(new ImagePattern(image4));

        //setting points images


        moneybag.setFill(new ImagePattern(point1));


        moneybag2.setFill(new ImagePattern(point2));


        moneybag3.setFill(new ImagePattern(point3));


        moneybag4.setFill(new ImagePattern(point4));

        //instantiating Translate=new TranslateTransition class
        TranslateTransition translateTransition=new TranslateTransition();

        //getting points
        point_1.setToY(1950f);
        point_1.setCycleCount(300);
        point_1.setAutoReverse(true);
        translateTransition.setByX(400);
        translateTransition.setToX(400);

        seq1 = new SequentialTransition (moneybag, point_1);


        point_2.setToY(1950f);
        point_2.setCycleCount(300);
        point_2.setAutoReverse(true);
        translateTransition.setByX(400);
        translateTransition.setToX(400);
        seq2 = new SequentialTransition (moneybag2, point_2);


        point_3.setToY(1950f);
        point_3.setCycleCount(300);
        point_3.setAutoReverse(true);
        point_1.setByX(400);
        point_1.setToX(400);
        seq3 = new SequentialTransition (moneybag3, point_3);


        point_4.setToY(1950f);
        point_4.setCycleCount(300);
        point_4.setAutoReverse(true);
        translateTransition.setByX(400);
        translateTransition.setToX(400);
        seq4 = new SequentialTransition (moneybag4, point_4);


        translate1.setToX(-1950f);
        translate1.setCycleCount(200);
        translate1.setAutoReverse(false);

        seqT1 = new SequentialTransition (cloud1, translate1);



        translate2.setToX(-1950f);
        translate2.setCycleCount(200);
        translate2.setAutoReverse(false);

        seqT2 = new SequentialTransition (cloud2, translate2);



        translate3.setToX(-1950f);
        translate3.setCycleCount(200);
        translate3.setAutoReverse(false);

        seqT3 = new SequentialTransition (cloud3, translate3);

        translate4.setToX(-1950f);
        translate4.setCycleCount(200);
        translate4.setAutoReverse(false);

        seqT4 = new SequentialTransition (cloud4, translate4);



        translate5.setToX(-1950f);
        translate5.setCycleCount(200);
        translate5.setAutoReverse(false);

        seqT5 = new SequentialTransition (cloud5, translate5);



        final Group group = new Group( createInstructions(), labels,cloud2,cloud3,cloud4,moneybag,moneybag2,moneybag3,moneybag4,root);


        cloud1.setX(1400);
        cloud1.setY(50);
        cloud2.setX(1400);
        cloud2.setY(400);
        cloud3.setX(1400);
        cloud3.setY(800);
        cloud4.setX(1400);
        cloud4.setY(500);
        cloud5.setX(1400);
        cloud5.setY(100);


        moneybag.setX(400);
        moneybag.setY(-40);
        moneybag2.setX(600);
        moneybag2.setY(-80);
        moneybag3.setX(700);
        moneybag3.setY(-70);
        moneybag4.setX(850);
        moneybag4.setY(-50);

        final Scene scene = new Scene(group,1350, 680);

        ImageView plain = createPlain(scene);

        root.getChildren().addAll(plane,cloud1,cloud2,cloud3,cloud4,cloud5);



        scene.addEventFilter(KeyEvent.KEY_PRESSED, event -> {
            double x = plane.getX();
            double y = plane.getY();

            if(event.getCode()==KeyCode.UP){
                plane.setY(y-10);
            }
            else if(event.getCode()==KeyCode.DOWN){
                plane.setY(y+10);
            }
            else if(event.getCode()==KeyCode.RIGHT){
                plane.setX(x+10);
            }
            else if(event.getCode()==KeyCode.LEFT){
                plane.setX(x-10);
            }
            else if(event.getCode()==KeyCode.ENTER){
                Play();
            }
        });

        stage.setTitle("The most enjoyable game to relieve stress always");
        stage.setScene(scene);
        stage.show();
    }


    public void Play(){
        seq1.play();
        seq2.play();
        seq3.play();
        seq4.play();
        seqT1.play();
        seqT2.play();
        seqT2.play();
        seqT3.play();
        seqT4.play();
        seqT5.play();

    }



    private ImageView createPlain(Scene scene) {

        plane.setFill(new ImagePattern(image));
        plane.setX(100);
        plane.setY(200);
        imageView.setFitWidth(110);
        imageView.setFitHeight(80);
        imageView.setY(scene.getHeight() - imageView.getFitHeight());

        return imageView;
    }
    private Label createInstructions() {
        instructions = new Label(
                //"\n\tPRESS ENTER TO PLAY THE GAME!\n\tSCORE:"
                " Don't forget to press enter to start the game"
        );

        labels.getChildren().add(instructions);

        instructions.setTextFill(Color.BLUEVIOLET);
        instructions.setFont(Font.font("Thoma", FontWeight.BOLD,22));


        return instructions;
    }


    public static void main(String[] args) {
        launch();
    }
}