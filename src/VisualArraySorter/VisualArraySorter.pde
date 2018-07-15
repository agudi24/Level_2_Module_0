/* Paste the code into a new Processing sketch and complete the steps. */

//1. create an array of ints. don't initialize it yet.
int[] number;


void setup() {
  //2. set the size of your window
  size(800, 800);
  //  if you are using Processing 3, you cannot use variables
  //  because the developers don't know how programming is supposed to work.

  //3. initialize your array with the built in width variable
  number = new int[200];

  //4. initialize the ints in the array with random numbers
  //   from 0 to the built in height variable


  //5. call the noStroke() method
  noStroke();
  
}

void draw() {
  //6. set the background color with background(r, g, b);
  background(196, 216, 226);
  //7. set the color for your graph
  fill(122,122,122);
  //8. draw a rectangle for each int in your array.
  for (int i = 0; i < number.length; i++) {
    rect(i*(width/200), height, width/200, -1 * number[i]);
  }


  //   the x value will be the element of the int
  //   the y value will the height variable
  //   the width is 1
  //   the height is negative the value of the int at that element in the array


  //9. call the stepSort method
  stepSort(number);
  //10. extract the code that randomizes the array into a method.

  //11. call the method you made in step 10 when the mouse is pressed
  if (mousePressed) {
    randomize();
  }
}
int count = 1;
void stepSort(int[] arr) {
    count = count % 199+1;
         
    if (arr[count - 1] > arr[count]) {
      fill(255,0,0);
       rect(count*(width/20), height, width/200, -1 * number[count]);
   rect((count-1)*(width/20), height, width/200, -1 * number[count-1]);
      int t = arr[count];
      arr[count] = arr[count - 1];
      arr[count - 1] = t;
    }else {
      fill(255,255,9);
       rect(count*(width/200), height, width/200, -1 * number[count]);
   rect((count-1)*(width/200), height, width/200, -1 * number[count-1]);
    }
    

  //count++;
  //delay(20);
}
void randomize() {
    for (int i = 0; i < number.length; i++) {
  int rand = (int)random(0, 801);
    number[i] = rand;
  }
}