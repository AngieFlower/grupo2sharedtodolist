const tasksSection= document.querySelector("#task-section");

// 3)
function showTask(tasks) {
    tasksSection.innerHTML = "";
    tasks.forEach((task, position) => {
        const htmlElement = document.createElement("div");
        htmlElement.innerHTML = `<div class="task">
            <div 
                class="close-button" 
                onclick="fetch(\`/tasks/${position}\`, { method: 'DELETE'}).then(reloadTasks)"></div>
            <p class="title">${task.description}</p>
        </div>`;
        tasksSection.appendChild(htmlElement)
    })
}


// 2)
let reloadTasks = () => {
    fetch("/tasks")
        .then(r => r.json())
        .then(showTask)
};

// 1)
document.addEventListener("DOMContentLoaded",reloadTasks)