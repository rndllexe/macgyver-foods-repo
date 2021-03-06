//preference categories
var prefDropDownBtn = document.querySelectorAll('.body__preferences');
var prefDownButton = document.querySelectorAll('#downPrefBtn');
var preferenceTitle = document.querySelectorAll('.choose__preferences_title');
var preferenceMenu = document.querySelectorAll('.preference__topLevel')

function bindPrefButtons() {
    const app = document.querySelector('#app');
    app.addEventListener('click', (event) => {
        if (event.target.classList.contains('body__preferences')) {
            const foodPreferencesContainer = document.querySelector('.foodPreferences__container');
            if (foodPreferencesContainer.style.display === 'block') {
            foodPreferencesContainer.style.display = 'none';
            foodPreferencesContainer.style.transformOrigin = 'bottom';
            foodPreferencesContainer.style.transform = 'scale(1,0.1);';
            foodPreferencesContainer.style.transition = '300ms';
            foodPreferencesContainer.style.maxHeight = '0';
            } else {
            foodPreferencesContainer.style.display = 'block';
            foodPreferencesContainer.style.transformOrigin = 'top';
            foodPreferencesContainer.style.transform = 'scale(1,0.1);';
            foodPreferencesContainer.style.transition = '300ms';
            foodPreferencesContainer.style.maxHeight = '3650px';
            }
        }
    });
}

function bindPrefTitleButton() {
    const app = document.querySelector('#app');
    app.addEventListener('click', (event) => {
        if (event.target.classList.contains('choose__preferences_title')) {
            const foodPreferencesContainer = document.querySelector('.foodPreferences__container');
            if (foodPreferencesContainer.style.display === 'block') {
                foodPreferencesContainer.style.display = 'none';
                foodPreferencesContainer.style.transformOrigin = 'bottom';
                foodPreferencesContainer.style.transform = 'scale(1,0.1);';
                foodPreferencesContainer.style.transition = '300ms';
                foodPreferencesContainer.style.maxHeight = '0';
                } else {
                foodPreferencesContainer.style.display = 'block';
                foodPreferencesContainer.style.transformOrigin = 'top';
                foodPreferencesContainer.style.transform = 'scale(1,0.1);';
                foodPreferencesContainer.style.transition = '300ms';
                foodPreferencesContainer.style.maxHeight = '3650px';
                }
        }
    });
}

function bindPrefDownButton() {
    const app = document.querySelector('#app');
    app.addEventListener('click', (event) => {
        if (event.target.classList.contains('temp_dropping_pref')) {
            const foodPreferencesContainer = document.querySelector(
            '.foodPreferences__container'
            );
            if (foodPreferencesContainer.style.display === 'block') {
            foodPreferencesContainer.style.display = 'none';
            foodPreferencesContainer.style.transformOrigin = 'bottom';
            foodPreferencesContainer.style.transform = 'scale(1,0.1);';
            foodPreferencesContainer.style.transition = '300ms';
            foodPreferencesContainer.style.maxHeight = '0';
            } else {
            foodPreferencesContainer.style.display = 'block';
            foodPreferencesContainer.style.transformOrigin = 'top';
            foodPreferencesContainer.style.transform = 'scale(1,0.1);';
            foodPreferencesContainer.style.transition = '300ms';
            foodPreferencesContainer.style.maxHeight = '3650px';
            }
        }
    });
}

export default function startPrefSite() {
    prefDownButton = document.querySelectorAll('#downPrefBtn');
    prefDropDownBtn = document.querySelectorAll('.body__preferences');
    preferenceTitle = document.querySelectorAll('.choose__preferences_title');
    preferenceMenu = document.querySelectorAll('.preference__topLevel');
    bindPrefButtons();
    bindPrefTitleButton();
    bindPrefDownButton();
}
