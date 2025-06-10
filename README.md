# IEEE PDF Compliance Checker – Backend

A Spring Boot service that validates a PDF against the IEEE Xplore layout specification.  
It focuses on **layout and formatting correctness**—page size, margins, fonts, columns format, and more—so authors can fix template violations before submitting their papers.

---

## Features

1. **One upload endpoint** – drop in a PDF (sent to the `/api/v1/check` endpoint) and get a compliance report.
2. **Pluggable rule engine** – every validation rule implements a common interface, making new checks easy to add or disable at runtime.  
3. **Structured compliance report** – each rule is graded *pass* or *fail* with a descriptive message and overall score.

---

## How it works

1. **Upload** – A PDF is uploaded (by the web app) to the backend.  
2. **Parsing & Validation** – The backend scans the file against a formatting checklist–page size, margins, fonts, and more.  
3. **Report** – It scores each rule, builds a JSON summary, and sends it back. The frontend then turns that JSON into the table and score on screen.

---

## Tech Stack

**Language & Framework:** Java (Spring Boot – Spring Web, Spring Data JPA)    
**Library:** Apache PDFBox   

---

## Frontend

**Repository:** https://github.com/1Ninad/Compliance-Checker-Frontend 
  
