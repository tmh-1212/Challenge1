✅ Sample README.md Template
# Challenge 1.1: The Cryptic Message Decoder

## 🚀 Description

This challenge simulates a secret agent decoding a cryptic numerical message. The goal is to take a single positive integer and extract meaningful information from it using only **variables and arithmetic operators**—**no loops or conditional statements allowed**.

The program:
- Extracts the **first** and **last** digits of the number.
- Multiplies the first and last digits.
- Extracts the **second** and **second-last** digits.
- Adds the second and second-last digits.
- Concatenates the product and the sum to create a final "decrypted code".

---

## 🧪 Example

**Input:**  
`13579`

**Step-by-step Breakdown:**
- First digit: `1`
- Last digit: `9`
- Product: `1 * 9 = 9`
- Second digit: `3`
- Second-last digit: `7`
- Sum: `3 + 7 = 10`
- Final code: `"9" + "10"` → `910`

**Output:**  


The decrypted code is: 910


---

## 🧠 Reflection

### What I Learned:
- How to manipulate integers using `Math.log10`, modulus `%`, and powers of 10 to extract specific digits.
- That it's possible to decode parts of a number without using any loops or if statements—just clever math.

### What Was Difficult:
- Understanding how to mathematically determine the position of each digit without converting the number to a string.
- Figuring out how to extract the second and second-last digits precisely using division and modulo.

---

## 📂 Files

- `Chapter1_Challenge_1_1.java` – Main source file containing the complete solution.

📝 GitHub Setup Instructions

If you haven’t already, follow these steps to create and push to your GitHub repo:

# 1. Create a new local folder for the project
mkdir Chapter1_Challenge_1_1
cd Chapter1_Challenge_1_1

# 2. Add your Java file and README.md
touch Chapter1_Challenge_1_1.java
touch README.md

# (Paste your Java code and README content into the files)

# 3. Initialize Git and commit
git init
git add .
git commit -m "Initial commit - Cryptic Message Decoder Challenge"

# 4. Create a new GitHub repository online (use the GitHub UI)

# 5. Link the local repo to GitHub and push
git remote add origin https://github.com/your-username/Chapter1_Challenge_1_1.git
git branch -M main
git push -u origin main
