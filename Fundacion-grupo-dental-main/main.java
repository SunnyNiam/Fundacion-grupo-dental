document.addEventListener('DOMContentLoaded', function () {
    const mainNav = document.getElementById('mainNav');
    const searchForm = document.getElementById('searchForm');

    mainNav.addEventListener('click', function () {
        searchForm.classList.toggle('hidden');
    });
});
