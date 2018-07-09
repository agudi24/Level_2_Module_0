/* Paste the code into a new Processing sketch and complete the steps. */

//1. create an array of ints. don't initialize it yet.
int[] number;

void setup() {
  //2. set the size of your window
  size(800, 800);
  //  if you are using Processing 3, you cannot use variables
  //  because the developers don't know how programming is supposed to work.

  //3. initialize your array with the built in width variable
  number = new int[width];
  
  //4. initialize the ints in the array with random numbers
  //   from 0 to the built in height variable
 
 
  //5. call the noStroke() method
  noStroke();

}

void draw() {
  //6. set the background color with background(r, g, b);
  background(196, 216, 226);
  //7. set the color for your graph
  fill(0);
  //8. draw a rectangle for each int in your array.
  rect(number[0], height, 1, -1 * number[0]);
  //   the x value will be the element of the int
  //   the y value will the height variable
  //   the width is 1
  //   the height is negative the value of the int at that element in the array


  //9. call the stepSort method
stepSort(number);
  //10. extract the code that randomizes the array into a method.

  //11. call the method you made in step 10 when the mouse is pressed
if(mousePressed){
  randomize();
}
}

void stepSort(int[] arr) {
  for (int i = 1; i < arr.length; i++) {
    if (arr[i - 1] > arr[i]) {
      int t = arr[i];
      arr[i] = arr[i - 1];
      arr[i - 1] = t;
    }
  }
}
void randomize(){
 number = new int[(int) random(0, height)];
}