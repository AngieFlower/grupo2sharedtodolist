const taskSection = document.querySelector("#task-section");

// 3)
function showTask(tasks) {
    taskSectionSection.innerHTML = "";
    task.forEach((task, position) => {
        const htmlElement = document.createElement("div");
        htmlElement.innerHTML = `<div class="task">
            <div 
                class="close-button" 
                onclick="fetch(\`/tasks/${position}\`, { method: 'DELETE'}).then(reloadTasks)">x</div>
            <p class="title">${task.title} (${task.year})</p>
        </div>`;
        tasksSection.appendChild(htmlElement)
    })
}


// 2)
let reloadTasks = () => {
    fetch("/task")
        .then(r => r.json())
        .then(showTasks)
};

// 1)