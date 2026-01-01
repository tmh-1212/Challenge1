✅ Sample README.md Template
# Challenge 1.1: The Cryptic Message Decoder

##  Description

This challenge simulates a secret agent decoding a cryptic numerical message. The goal is to take a single positive integer and extract meaningful information from it using only **variables and arithmetic operators**—**no loops or conditional statements allowed**.

The program:
- Extracts the **first** and **last** digits of the number.
- Multiplies the first and last digits.
- Extracts the **second** and **second-last** digits.
- Adds the second and second-last digits.
- Concatenates the product and the sum to create a final "decrypted code".

---

##  Example

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


