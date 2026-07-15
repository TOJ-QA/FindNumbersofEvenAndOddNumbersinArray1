# 🔢 Find Number of Even and Odd Numbers in an Array

![Java](https://img.shields.io/badge/Java-21-orange?logo=openjdk)
![IDE](https://img.shields.io/badge/IDE-Eclipse-purple?logo=eclipseide)
![Status](https://img.shields.io/badge/Status-Completed-brightgreen)
![Bootcamp](https://img.shields.io/badge/Cloudberry-Java%20Automation-blue)

---

# 📖 Overview

This project counts how many **even** and **odd** numbers are stored in an array.

The program loops through each element in the array, uses the **modulus operator (`%`)** to determine whether each number is even or odd, and keeps separate counters for both. After processing the entire array, it displays the total number of even and odd values.

This exercise was completed as part of my **Cloudberry Java Automation Bootcamp** to strengthen my understanding of arrays, loops, conditional statements, and counters.

---

# 🎯 Learning Objectives

✅ Create and initialize an array

✅ Traverse an array using a loop

✅ Use the modulus (`%`) operator

✅ Count even numbers

✅ Count odd numbers

✅ Display calculated results

---

# 🛠 Technologies Used

- ☕ Java 21
- 💻 Eclipse IDE
- 🖥 Windows 11

---

# 📂 Project Structure

```
FindNumbersofEvenAndOddNumbersinArray/
│
├── src/
│   └── FindNumbersofEvenAndOddNumbersinArray.java
│
└── README.md
```

---

# 💻 Sample Code

```java
int[] numbers = {12, 5, 8, 19, 24, 31, 42};

int evenCount = 0;
int oddCount = 0;

for (int number : numbers) {
    if (number % 2 == 0) {
        evenCount++;
    } else {
        oddCount++;
    }
}

System.out.println("Even Numbers: " + evenCount);
System.out.println("Odd Numbers: " + oddCount);
```

---

# ▶ Sample Output

```
Even Numbers: 4
Odd Numbers: 3
```

---

# 🧠 Concepts Learned

📌 Arrays

📌 Enhanced `for` Loop

📌 Variables and Counters

📌 Modulus Operator (`%`)

📌 If-Else Statements

📌 Conditional Logic

📌 Console Output

---

# 📸 Screenshots

## Eclipse Project

> *(Insert screenshot here)*

Example:

```
images/eclipse-project.png
```

---

## Program Code

> *(Insert screenshot here)*

Example:

```
images/code.png
```

---

## Console Output

> *(Insert screenshot here)*

Example:

```
images/output.png
```

---

# 🚀 Future Improvements

- Allow users to enter their own array values using the `Scanner` class
- Display the actual even and odd numbers, not just the totals
- Calculate the sum of even and odd numbers separately
- Find the largest and smallest numbers in the array
- Store the even and odd numbers in separate arrays

---

# 📚 What I Learned

This project strengthened my understanding of how arrays store collections of data and how loops can process each element efficiently. I also gained experience using counters and conditional statements to categorize data based on whether numbers are even or odd.

These skills are foundational for solving more advanced programming problems involving collections of data and algorithm design.

---

# 👨‍💻 Author

**Tracy Joseph**

QA Automation Student

Cloudberry Java Automation Bootcamp

GitHub:
https://github.com/TOJ-QA

---

⭐ Thank you for checking out my Find Number of Even and Odd Numbers in an Array project!
