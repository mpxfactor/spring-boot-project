const avatar = document.querySelector(".avatar");
const menu = document.querySelector(".avatar div");
let show = true;

avatar.addEventListener("click", () => {
  show ? menu.classList.remove("hidden") : menu.classList.add("hidden");
  show = !show;
});
