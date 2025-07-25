package _01_methods._2_spinning_record;

import game_tools.Sound;
import processing.core.PApplet;
import processing.core.PImage;

/*
 * Goal: Ok DJ! Make your own turn tables!
 * 
 * 1. Make an int variable to keep track of how much the record will spin.
 
 * In the setup() method:
 * 2. Load a picture of a record using the loadImage() method:
 *    pictureOfRecord = loadImage("images/record.png");
 * 
 * 3. Call the image variable's resize() method to set the image's width and
 *    height to the window's width and height.
 * 
 * 4. Call the image() method to display the record image. Do you see it?
 * 
 * In the draw() method:
 * 
 * 5. Make the record spin by increasing the variable from step 1.
 * 
 * 6. Call the rotateImage() method to rotate record by the specified amount
 *    rotateImage(PImage image, int amountToRotate);
 * 
 * 7. Call the image() method to display the record image
 *    Make sure to put this code AFTER the rotateImage() method.
 * 
 * 8. Does the record rotate when the mouse is pressed?
 * 
 * 9. Modify your code so the record only spins when the mouse is pressed.
 * 
 * 10.Use the song.play() and song.stop() methods to play a song ONLY when
 *    the record is spinning.
 */
public class SpinningRecord extends PApplet {
    static final int WIDTH = 600;
    static final int HEIGHT = 600;
    int times_spun = 0;
    
    Song song = new Song("awesomeTrack.mp3");
    PImage pictureOfRecord;
    @Override
    public void settings() {
    	
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
    	pictureOfRecord=loadImage("images/record.png");
        pictureOfRecord.resize(600,600);
        image(pictureOfRecord,0,0);
    }

    @Override
    public void draw() {
        times_spun+=1;
        if (rotateImage(pictureOfRecord, times_spun)==true) {
        	song.play();
        	image(pictureOfRecord,0,0);
        }
        else{
        	song.stop();
        }
    }

    static public void main(String[] args) {
    	try {
            Class<?> quitHandlerClass = Class.forName("com.apple.eawt.QuitHandler");
            //Call your main class here
            PApplet.main(SpinningRecord.class.getName());
        } catch (ClassNotFoundException e) {
            System.out.println("Not a Mac OS X system, no need to handle quit event.");
        }
       
    }
    
    /*********************** DO NOT MODIFY THE CODE BELOW ********************/

    boolean rotateImage(PImage image, int amountToRotate) {
        translate(width / 2, height / 2);
        rotate(amountToRotate * TWO_PI / 360);
        translate(-image.width / 2, -image.height / 2);
        return true;
    }

    class Song extends Sound {
        public Song(String songAddress) {
            super(songAddress);
        }

        @Override
        public void play() {
            if( !super.isPlaying() ) {
                System.out.println("playing");
                super.play();
            }
        }
    }
}
