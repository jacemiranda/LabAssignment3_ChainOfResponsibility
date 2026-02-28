# Automated Waste Management System

## Background
[cite_start]Municipalities and cities face significant challenges in managing and efficiently disposing of waste[cite: 2]. [cite_start]Traditional waste collection methods often result in delays, inefficiencies, and high operational costs[cite: 3]. [cite_start]An innovative solution is needed to automate the waste management process, ensuring timely collection and disposal while optimizing resource utilization[cite: 4].

## Objective
[cite_start]Develop an automated waste management system that uses a chain of responsibility pattern to ensure efficient waste collection and disposal[cite: 5]. [cite_start]The system should handle different types of waste containers and trigger appropriate disposal actions based on the type and capacity of each container[cite: 6].

## Requirements
1. [cite_start]**Waste Container**: Create a class to represent waste containers, each with a specific capacity and type of waste (e.g., organic, recyclable, hazardous)[cite: 8].
2. [cite_start]**Waste Collection Chain**: Implement a chain of responsibility pattern to handle different types of waste containers[cite: 9]. [cite_start]Each handler in the chain should be responsible for collecting and disposing of a specific type of waste[cite: 10].
3. **Waste Collection Process**:
    * [cite_start]The system should initialize a chain of waste collectors, each responsible for a different type of waste[cite: 12].
    * [cite_start]When a waste container is full or needs disposal, the system should trigger the waste collection process[cite: 13].
    * [cite_start]The appropriate waste collector in the chain should handle the disposal based on the type and capacity of the waste container[cite: 14].
4. [cite_start]**Validation**: Ensure that waste containers are correctly identified and disposed of by the appropriate waste collector in the chain[cite: 15].

## UML Diagram
<img width="1682" height="1120" alt="LabAssignment3_ChainOfResponsibility" src="https://github.com/user-attachments/assets/006bbc3e-ac7a-4259-adda-56fbfc1402f7" />
