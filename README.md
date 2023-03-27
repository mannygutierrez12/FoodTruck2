<h1>Food Truck Project</h1>

<h2>Overview</h2>

This is our week 2 project. In this project, we will be putting together the knowledge we have gained in the first two weeks of this cohort.

<h3><h3>How the Program Works</h3>

The purpose of this program is to create a database of potential food trucks. The user is presented with a main menu that will continue to appear until the user chooses to quit or selects option 6. Within this menu, the user can create, view all trucks, see the highest rated truck, the least rated truck, and the average rating. All of this information will be populated with user data. If the user does not enter any data, a message will appear prompting them to do so. Once the user has finished entering all the data, they can quit the program and a farewell message will be displayed.

<h3>Technologies Used</h3>
<li>Java</li>
<li>Eclipse IDE</li>
<li>IntelliJ IDE</li>
<li>Object Oriented Programming (OOP)</li>
<li>MAC OS</li>

<h3>References Used</h3>

During the creation of this program, we faced many challenges. We were able to find answers utilizing websites like StackOverflow and video references from Tim Buchalka's course, "Complete Java Programming."

<h3>Challenges</h3>

The biggest challenge we faced during the creation of this program was the issue of scope, especially using loops and while loops. Multiple times we had to stop the creation phase and start the debugging phase because the IDE was pointing out an error message or an out of scope message.

Another challenge we faced was the limitation of using static methods. For instance, we were unable to write any static method to be used in the main method. The only method we could use was a void method using an instance of a programComponent that was connected to the Truck Class. When we tried to create more methods, we received a message saying that the request was out of scope. The main reason for this was that the instances we created were in the main methods, and the other methods were created in the Truck class. Because of this, the only method we decided to use was a void method with the reference of programComponents.

Another challenge we faced was using the Scanner. For instance, when the program prompted the user to enter a string, if the user entered a name with a space, the second string was completed, and it jumped into the third user input request. After multiple attempts at trying to fix the problem using .next() and .nextLine(), we found a solution and decided to inform the user to enter the name without spaces. For instance, "Taco Loco" would become "TacoLoco." In a future version of this program, a String builder might be used to separate names, for instance, "Taco_Loco" = "Taco Loco."

We also decided to use Strings to represent numbers instead of integers. The reason for this was that if the user typed a letter, the scanner prompting the user to enter a number from 1 to 6 would crash immediately. Using Strings allowed us to check for valid inputs and prevent the program from crashing.

We also faced challenges with mixing for loops, while loops, arrays, and constructors. Multiple times, we had to "guess" how to get the data from an array or object and vice versa.

<h3>Lesson Learned</h3>

Our biggest lesson learned was to identify the areas where we needed to focus and practice more. Before starting this project, we felt comfortable with data manipulation, especially with our background in data analysis. However, learning a new language like Java presented a different set of challenges, and we need to continue practicing to improve our skills.
