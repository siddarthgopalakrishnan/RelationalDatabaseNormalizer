# RelationalDatabaseNormalizer

## Running the program:
* Clone the project to a directory of choice using `git clone https://github.com/siddarthgopalakrishnan/RelationalDatabaseNormalizer.git`
* To use the CLI, run `./script.sh`
* Run the GUI on NetBeans IDE by executing the Module1GUI.java file in `./Module1GUI/src/module1gui/Module1GUI`

## Input Procedure:
* Relation: R(A1, A2, ..... , An)
* Functional Dependencies: Ai,Aj, ... ,Ak->Ap,Aq, ... ,Ar;Ai,Aj, ... ,Ak->Ap,Aq, ... ,Ar (Semicolon separated values)

## Changes Made:
* Made Separate FDs in relation Constructor
* Changed the isPartialKey Method.
* Some changes in separateFDs, decomposeInto2NFScheme
* Implemented GUI using Java-Swing
