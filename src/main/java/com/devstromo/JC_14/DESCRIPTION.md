We are invoking the Simpson class here with the values, "Bart" and age 8.

`Simpson simpson = new Simpson("Bart", 8);`

One important thing to note is that static variables will be always executed first so the first value to be printed will be:

`D'oh`

Another important point of this quiz is that constructors have to invoke a super constructor before executing its actions:

`Simpson(String name, int age) {
super(name, age);
        // .....
}`

Then, note that we are assigning Homer to the name variable.

In the age variable, we are assigning the own instance variable as we are using "this".

this.name = "Homer";
this.age = this.age;

We will be printing c2 as well in this constructor.

After this constructor finishes its process the other one from the subclass will print c1.

Then the final result will be:
D'oh
character
simpson
Homer,35