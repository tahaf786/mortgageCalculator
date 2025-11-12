# Mortgage Calculator (Java)

A simple **command-line mortgage calculator** written in Java that computes your **monthly mortgage payment** based on principal, annual interest rate, and loan period.

**Now with input validation using `while` loops** to ensure valid user input — no more crashes on bad data!

---

## Features

- Clean, user-friendly console interface
- Input validation with clear error messages
- Supports:
  - Principal: `$1,000 – $1,000,000`
  - Annual Interest Rate: `> 0% – 30%`
  - Loan Period: `1 – 30 years`
- Outputs **formatted currency** (e.g., `$1,234.56`)
- Uses the standard mortgage formula:

$$
M = P \frac{r(1+r)^n}{(1+r)^n - 1}
$$

---

## How to Run

### Prerequisites
- [Java JDK 8 or higher](https://www.oracle.com/java/technologies/downloads/)
- Any IDE (IntelliJ, Eclipse, VS Code) **or** terminal

### Steps

#### Option 1: Using Terminal (Recommended)

1. Save the code as `Main.java`
2. Open terminal in the folder
3. Compile:
   ```bash
   javac Main.java
