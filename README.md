# represent a solver for the queens problem

## [your name here]'s remarks

### citations / worked with / received help from
Replace this paragraph with a solid accounting of your sources.
People have become either lackadaisical or dishonest
about crediting others for ideas and help. 
If I grade this work, I will rely on this section as
a complete listing for judging academic honesty.

This list may omit sources common to everyone in the course,
including...
* Piazza threads
* class-wide discussions
* communication with Holmes via the class
web site or GitHub repos.


## Holmes's remarks

### no parameters and no return in the recursive method
Unlike many recursive solutions, `recordSolutionsStarted` in `SolverForQueensPuzzle`...

* takes no parameters and 
* returns no value.

That's ok, because all that information is communicated via
the state of an instance of `SolverForQueensPuzzle`:

* No parameters are required because
the `inProgress` board "knows" which rank `recordSolutionsStarted` 
should work on, namely, that board's most-recently populated rank.

* No return value is required  because 
an invocation of `recordSolutionsStarted` communicates its results
by updating the `solutions` collection.

We have seen this kind of communication elsewhere: 
No return value is required 
in the Towers of Hanoi puzzle, when you call on  Monk3 to 
move 3 platters. Monk3 returns nothing to you. Rather,
Monk3 communicates their results to you by updating
the towers / disks instance.

<!--- (is this a comment in GFM? Does it need 3 hyphens?)
* No parameters are required
when handing in papers. That is, you pass no parameter information
to the next person in the file of seats. 
Rather, the file instance that you share holds the information
of who is next. Looking at that file
tells a person whether they are the base case.
--->


### testing via `UserOfSolver`

`UserOfSolver` can take two command-line arguments.
Ignore the second one temporarily. 

The first command-line argument is required and gives the
number of ranks in the largest board to be analyzed.
`UserOfSolver` will analyze all boards from size 0 up to
the given size.

>You are the kind of person who tests base cases first
when debugging recursive programs, right?
So what size boards will test only the base cases?

After the base cases, I verified my program's operation on a the 
largest recursive case I could stand: I was proud to make
it through boards of size 3 and part way into 4.

Once you have seen both base cases and a couple recursive cases work,
clean up your output by commenting out the debugging statements.
With the debugging commented out, I checked the solutions for 
boards of size 4 and 6.

>You weren't going to **delete** useful debugging
statements, were you? What if your program stops working some time
in the future? This may not matter to students, but in the
real world, programs change constantly. That's why it's called
"**soft**ware". With improvements come bugs,
so it is worth saving good debugging code.

John Bruestle taught me that one should print no more output
than one is willing to read, since extraneous junk hides
problems and answers that you want to see.
So unless you're going to look at all 40 solutions to a
7-queens puzzle, benefit from the second command line argument.

The optional second command line argument imposes a cap on the 
number of solutions displayed, saving both time and
screen real estate.
For example, the command...
```
java UserOfSolver 7 3
```
Shows the up to 3 solutions for each of the puzzles of size
0 through 7.
You can limit output to just summaries (no boards shown)
with a command like...
```
java UserOfSolver 13 0
```

The number of solutions is given in
[this table](https://oeis.org/A000170/b000170.txt )
in N.J.A. Sloane's amazing
[*The On-Line Encyclopedia of Integer Sequences*](https://oeis.org)


