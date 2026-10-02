# Experiment 3 – Installing Docker and Issuing Docker Commands

## Aim

To install Docker on Windows and execute basic Docker commands for downloading images, creating containers, viewing containers and images, and managing Docker resources.

## Software / Requirements

- Docker Desktop
- Windows 11
- PowerShell
- WSL2

## Docker Version

Docker version 29.8.1, build 4a63305

## Commands Executed

### 1. Verify Docker Installation

    docker --version

### 2. Display Docker Information

    docker info

### 3. Pull Docker Image

    docker pull hello-world

### 4. List Docker Images

    docker images

### 5. Run Hello World Container

    docker run hello-world

### 6. Run Ubuntu Container

    docker run -it ubuntu bash

Inside the Ubuntu container:

    ls
    cat /etc/os-release

### 7. List Containers

    docker ps
    docker ps -a

### 8. Start a Container

    docker start elated_jepsen

### 9. Stop a Container

    docker stop elated_jepsen

### 10. Remove a Container

    docker rm elated_jepsen

### 11. Remove Docker Image

    docker rmi ubuntu:latest

### 12. Final Image Verification

    docker images

## Result

Thus, Docker was installed and verified successfully. Docker images were pulled, containers were created and executed, and basic Docker commands for viewing, starting, stopping, removing containers and managing images were performed successfully.
