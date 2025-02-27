package edu.nus.duke.command;

import edu.nus.duke.task.Task;
import edu.nus.duke.task.TaskList;

/**
 * Represent add command that extends from Command.
 */
public class AddCommand extends Command {
    public static final String CMD_TODO = "todo";
    public static final String CMD_DEADLINE = "deadline";
    public static final String CMD_EVENT = "event";
    private Task task;

    public AddCommand(Task task) {
        this.task = task;
    }

    @Override
    public CommandResult run(TaskList taskList, CommandDataHistory commandDataHistory) {
        commandDataHistory.add(taskList);
        String feedback = taskList.addTask(task);
        return (new CommandResult(feedback, false));
    }
}
