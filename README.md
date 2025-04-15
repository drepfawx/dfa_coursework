# DFA for Recognizing 8-Character Strings

This Java program is part of my coursework in **Discrete Structures**, where I have to synthesize a deterministic finite automaton **(DFA)**, designed to recognize strings of length 8 that follow a specific pattern.

## Language Definition
The DFA accepts only strings that meet the following criteria:

1. The **1st character** must be `c`.
2. The **2nd character** must be either `a` or `b`.
3. The **3rd character** must be `c`.
4. The **4th to 8th characters** must be either `b` or `c` (in any order).

### Example of Accepted Strings
- `cacbbcbc` ✅ **Accepted**  
- `cccbbccc` ❌ **Rejected** (2nd character is not `a` or `b`)  
- `cacbbcb` ❌ **Rejected** (Length is not 8)  
- `cacbbcbx` ❌ **Rejected** (8th character is not `b` or `c`)  

---
![image](https://github.com/user-attachments/assets/a9523948-9bce-42f2-8250-716a8497b87a)
*Figure: DFA state transition diagram (badly drawn).*
