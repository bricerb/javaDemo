let input = document.querySelector("#input");
let inputV = input.value;
let userName = document.querySelector(".user-name");
let todoList = document.querySelector(".list");
let listContainer = document.querySelector(".list-container");
let icon = document.querySelector(".icon");
let user = {
  name: "harro",
};
let isHiddenList = false;
let listData = [];

let setUserName = function() {
  userName.innerHTML = user.name;
}();

let setList = function(str) {
  let text = "<li>" + str + "</li>";
  todoList.insertAdjacentHTML("beforeend", text);
};

let addItem = function() {
  if (isHiddenList) {
    listContainer.classList = "list-container";
  }
  inputV = input.value;
  setList(inputV);
  input.value = "";
};

icon.addEventListener("click", function(e) {
  addItem();
});

input.addEventListener("keypress", function(e) {
  if (e.keyCode === 13) {
    addItem();
  }
});

if (listData.length === 0) {
  listContainer.classList = "list-hide";
  isHiddenList = true;
} else {
  for (var i = 0; i < listData.length; i++) {
    setList(listData[i]);
  }
}








// $scope.setCurrentScaleLevel = function(scaleLevel) {
//         console.log("Setting scale level for user");
//         $scope.user.currentScaleLevel = scaleLevel;
//         $http.post("/getDesiredScaleLevel.json", $scope.user)
//         .then (
//             function successCallBack(response) {
//                 console.log("User updated");
//                 $scope.currentScaleLevel = response.data;
//             },
//             function errorCallBack(response) {
//                 console.log("Unable to update user");
//             });
//     };












// Whitespace
