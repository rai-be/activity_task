package org.example;

import java.util.UUID;

public class Task {
    private String id;
    private String description;
    private boolean completed;
    private int priority;

    public Task(String description, int priority) {
        this.id = UUID.randomUUID().toString();
        this.description = description;
        this.completed = false;
        setPriority(priority);
    }

    public String getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        if (priority < 1 || priority > 3) {
            throw new IllegalArgumentException("A prioridade deve ser 1 (Baixa), 2 (Média) ou 3 (Alta).");
        }
        this.priority = priority;
    }

    public String getPriorityAsString() {
        switch (priority) {
            case 1: return "Baixa";
            case 2: return "Média";
            case 3: return "Alta";
            default: return "Desconhecida";
        }
    }

    @Override
    public String toString() {
        return "Task{id='" + id + "', description='" + description + "', completed=" + completed + ", priority=" + getPriorityAsString() + "}";
    }
}
