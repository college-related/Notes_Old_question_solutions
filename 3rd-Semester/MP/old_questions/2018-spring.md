# 2018-Spring

## 1a, Evolution of Intel MP starting from 16-bit architecture to 64-bit architectures.

## 1b,

[Same as 2012-fall 1b part 2]()

## 2a, Write function , addressing modes, size and name of machine cycles for the following instruction.

i, LDAX D
ii, ADI 32H
iii, LXI B, 2075H

|Instruction|Size|Addressing mode|Function|Machine Cycles|
|--|--|--|--|--|
|LDAX D|
|ADI 32H|
|LXI B, 2075H|

## 2b, Instruction cycle, machine cycle and T-states.

- **Instruction Cycle**
    - It is a fetch-decode-execute cycle that CPU follows from boot-up to the shut down of the computer in order to process the instrcution provided.
- **Machine Cycle**
    - It is the 
- **T-States**

## 2c, Timing diagram of MVI A, 32H

[Similar as 2012-fall 2a]()

## 3a, What do you mean by Segmentation offset Scheme in 8086 Microprocessor. Explain with suitable example.

## 3b, WAP to subtract two 16-bit numbers and store the result in memory location starting from 2075H

## 3c, Explain various assembler directives.

- Assembly language supports a number of statements that enables to control the way in which a source program assembles and lists.They are called assembler directives.
- The most comman Assembler Directives are:-
    1. **PAGE DIRECTIVE**
        - It helps to control the format of a listing of an assembled program. It is a optional Directives.
        - `Format PAGE [LENGTH],[WIDTH]` length is the maximum lines a page can have and width is the maximum characters a line can have.
        - Default values to 50,80.
    1. **TITLE DIRECTIVE**
        - It is used to define a title of the program. It is also a optional Directive.
        - `Format TITLE "TEXT"`
    1. **SEGMENT DIRECTIVE**
        - It is used to define the start of a segment.
        - A Stack segment defines stack storage, a data segment defines data items, and a code segment provides executable code.
        
                FORMAT 
                    .STACK [SIZE]
                    .DATA
                        --data to initailize
                    .CODE
                        --codes
    1. **MEMORY MODEL DIRECTIVE**
        - It is used to define how to use segments to provide space and ensure optimum execution speed.
        - `FORMAT .MODEL [MODEL NAME]`
        - The models can be `TINY, SMALL, MEDUIM, COMPACT, etc`
    1. **THE PROC DIRECTIVE**
        - The code segment contains the executable codes for a program, which consists of one or more procedures, defined initailly by `PROC Directive` and ended with `ENDP Directive`
        
                Format
                    Procedure name PROC
                            ...........
                            ...........
                    procedure name ENDP
    1. **END DIRECTIVE**
        - As mentioned above ENDP ends the procedure same as END Directive ends the whole program.
        - `FORMAT END [PROCEDURE NAME]`
    1. **THE EQU DIRECTIVE**
        - It is used to redefine symbolic names.

                Example:
                    DATAX DB 25
                    DATA EQU DATAX
    1. **THE .STARTUP and .EXIT DIRECTVE**
        - MASM 6.0 introduced the .STARTUP and .EXIT directive to simplify the initailization and termination of program.

## 4a, 

[Same as 2019-spring 4a]()

## 4b, Write a procedure program for 8086 for new line and use it to display the three different string in different lines.

## 5a, What are various sources of interrupts. Explain interrupt vector table in 8086 MP.

- A interrupt is a emergency signal that when the microprocessor gets it stops all the further execution of instruction and service the interrupt first. A interrupt can occur in the microprocessor internally or externally.
- The sources of interrupts are as follows:-
    1. **Processor Interrupts**
        - This interrupt is caused by some error conditions produced in the processor internally during the execution of instruction.
        - Example: divide by zero, register overflow,etc
    1. **Hardware Interrupts**
    1. **Software Interrupts**

- 2nd part in [2019-spring 5b]()

## 5b, What do you mean by address decoding? Design an address decoding circuit to interface 4K*8 RAM, 8K*8 ROM and 16K*8 RAM with starting address 0000h
 
## 6a, Given MP with clock freqeuncy 10MHz. WAP for 8254 PIT to generate a square wave of frequency 2KHz. 

## 6b, How cascading is done to handle more than 8 interrupts using 8259A PICs?Explain

## 6c, Write 8085 program for 8255 PPI to take input from input device connected to Port B and display the value of input on the output device connected to Port A of 8255 PPI

## 7

### a, Direct Memory Access Controller

### b, Different types of Assembler

### c, 8085 flag register