# RowColWeightSplit

A simple Android Jetpack Compose project demonstrating **Row and Column layouts with weights**.

## Overview

- Created a Row layout where the left section is a single Box (25% width) and the right section is a Column (75% width).

- In the right section, the Column contains three stacked boxes, each occupying a different proportion of vertical space according to their weights (2:3:5).

- Used background colors and text labels to clearly visualize how the weighted proportions work in both the Row and the Column.

## Key Components

- `MainActivity.kt`  
  Contains the main Compose content and sets up the layout.
  
- `RowColWeight()` Composable  
  Implements the layout:
  - Left `Box` (25% width)
  - Right `Column` (75% width) with 3 children:
    - Child 1: weight 2 (blue)
    - Child 2: weight 3 (orange)
    - Child 3: weight 5 (purple)


## How to Run the App

1. Clone this repository:
   ```bash
   git clone https://github.com/shanji361/RowColWeightSplit.git
