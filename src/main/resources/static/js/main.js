const tasks= document.querySelector("#task-section");

// 3)
function showTask(tasks) {
    tasks.innerHTML = "";
    tasks.forEach((task, position) => {
        const htmlElement = document.createElement("div");
        htmlElement.innerHTML = `<div class="task">
            <div 
                class="close-button" 
                onclick="fetch(\`/tasks/${position}\`, { method: 'DELETE'}).then(reloadTasks)">x</div>
            <p class="title">${task.title} (${task.year})</p>
        </div>`;
        tasks.appendChild(htmlElement)
    })
}


// 2)
let reloadTasks = () => {
    fetch("/task")
        .then(r => r.json())
        .then(showTask)
};

// 1)
document.addEventListener("DOMContentLoaded",reloadTasks)