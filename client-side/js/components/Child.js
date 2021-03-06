export default function Child(child) {
    return `
        <div class="test_child_grid">
            <input type='hidden' id='childId${child.id}' value=${child.id} />
            <h2 class='child__name'>${child.firstName}</h2>
            <p class="child__age">Age: ${child.age}</p>
            <div class="child__allergies_div">
            <h4>List of Allergies:</h4>
            <ul>
            ${child.allergies.map((allergy) => {
        return `
                    <li>
                        <span class="added-allergy-list">${allergy.allergy}</span>
                    </li>
                `;
    }).join('')}
            </ul>
                <button class="allergy-list-btn" type="button">+ Add an Allergy</button>
                <button class="delete__allergy_minus" type="button">- Remove an Allergy</button>
            </div>
            <div class="child__preferences_div">
            <h4>List of preferences:</h4>
            <ul class="child__preferences">
            ${child.preferences.map((preference) => {
        return `
                    <li>
                        <span>${preference.preference}</span>
                    </li>
                `;
    }).join('')}
            </ul>
                <button class="preference-list-btn" id="childId" value="${child.id}" type="button">+ Add a Preference</button>
                <button class="delete_preference_minus" id="childId" value="${child.id}" type="button">- Remove a Preference</button>
            </div>
            <button class="search_recipes_button">Search Recipes</button>
            <button class="view_saved_recipes">My Recipes</button>
        </div>
        `;
}