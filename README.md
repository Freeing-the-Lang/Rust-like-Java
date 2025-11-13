# Rust-like-Java  
Experimental language project: **Java reinterpreted with Rust-style semantics**  
🦀 ➜ ☕ **Ownership, Borrowing, Safety — but in a Java-like syntax**

---

## 🚀 What is Rust-like-Java?

Rust-like-Java is an experimental language exploration that asks:

> **“What if Java had Rust’s safety model, ownership system, and zero-cost abstractions?”**

This project builds a Java-shaped language that features:

- Rust-like **ownership / borrowing**
- Rust-like **lifetimes (auto-inferred)**
- Java-like **syntax and class model**
- Optional **GC-free mode**
- **Heap-Hop Edition** (all-heap experimental model)
- **C++ backend** (planned)
- **RustSpec-style semantics** (planned)

---

## 🧬 Design Goals

- Bring Rust-level safety into a Java-like language  
- Add predictable memory behavior  
- Remove hidden runtime costs  
- Enable transpilation to:
  - C++
  - NASM
  - Pure-Rust-No-LLVM backend
  - JVM-free bytecode (planned)

---

## 📦 Current Status

This is an early-stage experiment.  
Everything is subject to change.

**Working stages planned:**

1. ✨ Tokenizer  
2. ✨ Parser  
3. ✨ AST  
4. ✨ Semantic phase (Rust-like ownership)  
5. 🚧 C++ codegen  
6. 🚧 JVM-free backend  
7. 🚧 Full compiler pipeline

---

## 🛠️ Build (3OS Supported)

This repository is part of the **Freeing-the-Lang** ecosystem —  
all languages build with:

- Linux  
- macOS  
- Windows  
- Auto ProofLedger  
- Auto Release

---

## 🤝 Contributing

Everyone is welcome to experiment, fork, or extend the idea.

---

## 📄 License

MIT License  
Free to use, change, break, or rebuild.

---

## 🌍 Part of the Freeing-the-Lang Ecosystem

Check out other experiments:

- Rust-like-Ruby  
- Rust-like-Go  
- Pure-Rust-No-LLVM  
- Jvm-without-Java  
- multi-main-lang  
- Heap-Hop Edition

Explore. Mix. Break things.
