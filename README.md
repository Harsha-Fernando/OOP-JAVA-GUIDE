# Java OOP — Learn by Running

Clone this. Run it. Open the little `.java` files and poke around while you learn.

That's really the whole idea. :-)

This isn't a giant framework or a "production-ready" anything. It's a small pile of Java examples — cars, users, dogs, payments — that walk you through object-oriented programming one friendly step at a time. The code is meant to be read. The comments talk to you. And there's a longer tour in [`LEARN_OOP.md`](LEARN_OOP.md) if you want someone sitting beside you explaining what each file is doing.

Happy coding :-)

---

## What you'll meet

| Idea | File(s) |
|------|---------|
| Classes & objects | `Car.java` |
| Constructors & encapsulation | `User.java` |
| Inheritance + abstract classes | `Animal.java`, `Dog.java` |
| Interfaces & polymorphism | `Payment.java`, `PayPal.java`, `Stripe.java` |
| Everything on stage | `Main.java` |
| Your turn | `BrowserExercise.java` |

Don't memorize the table. Run the program. Then open the files. Then read the guide. That order works surprisingly well.

---

## Clone it

```bash
git clone <your-repo-url>
cd Java_OOP
```

(If you already have the folder on your machine, skip straight to "Run it.")

---

## What you need

- **Java** (this project is set up for a modern JDK — see `pom.xml`)
- **Maven** (or open the project in an IDE like NetBeans / IntelliJ / VS Code and run `Main`)

---

## Run it

From the project root:

```bash
mvn compile exec:java
```

Or just open `Main.java` in your IDE and hit Run.

You should see something like:

```text
Driving ...
User Name = Harsha
German Shepard Eating ...
German Shepard Barking ...
Paid through PayPal
Paid through Stripe
```

If that prints, you're in. The demos worked. Now go read the code that made them happen.

---

## How to learn from this

1. **Run `Main`** — see what the program actually does.  
2. **Open the matching `.java` file** — the comments point at the guide.  
3. **Read [`LEARN_OOP.md`](LEARN_OOP.md)** — one concept at a time, same warm pace.  
4. **Try the browser exercise** in `BrowserExercise.java` when you're ready to write, not just read.

Learning to program is hard enough as it is. So take it slow. One file. One idea. One "ohhh, that's what that means."

---

## A tiny map of the repo

```text
Java_OOP/
├── LEARN_OOP.md          ← the beginner guide (start here after you run)
├── README.md             ← you are here
├── pom.xml               ← Maven project settings
└── src/main/java/com/mycompany/java_oop/
    ├── Main.java
    ├── Car.java
    ├── User.java
    ├── Animal.java
    ├── Dog.java
    ├── Payment.java
    ├── PayPal.java
    ├── Stripe.java
    └── BrowserExercise.java
```

---

Clone this and run and check these codes while learning!

Happy coding :-)
